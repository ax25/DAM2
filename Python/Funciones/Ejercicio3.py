__author__ = 'AlumnoT'
'''def f(a, b):
    c = a + 2 * b
    d = b ** 2
    return c + d

a = 3
b = 2
c = f(b, a)
d = f(a, b)
print c, d
Resultado=17 11'''

'''def f(x):
    a = x ** 2
    b = a + g(a)
    return a * b

def g(x):
    a = x * 3
    return a ** 2

m = f(1)
n = g(1)
print m, n
Resultado=10 9'''

def f(n):
    if n == 0 or n == 1:
        return 1
    a = f(n - 2)
    b = f(n - 1)
    s = a + b
    return s

print f(5)

