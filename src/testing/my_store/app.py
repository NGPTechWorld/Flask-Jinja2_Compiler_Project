# T14: المفروض يطلع Type Error، بس حالياً RAH ما يطلع
def foo() -> int:
    x = "a"
    y = x + "abc"
    return x