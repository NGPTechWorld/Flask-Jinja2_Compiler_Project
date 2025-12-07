# Clean old out folder
if (Test-Path out) {
    Write-Host "Cleaning out folder..."
    Remove-Item -Recurse -Force out
}

# Create out folder
if (-not (Test-Path out)) {
    New-Item -ItemType Directory -Path out
}

# Collect all Java files
$javaFiles = Get-ChildItem -Path src -Recurse -Filter *.java | ForEach-Object { $_.FullName }

# Compile
Write-Host "Compiling Java files..."
javac -cp ".\lib\antlr-4.13.2-complete.jar;." -d out $javaFiles

# Run MainTest
Write-Host "Running MainTest..."
java -cp ".\lib\antlr-4.13.2-complete.jar;out" MainTest
