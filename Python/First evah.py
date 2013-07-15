#Hello World!
print "hello world"
blorb = 55.
print(blorb)

print "the\n cat\n is\n great\n"

print """the
lion
is
prideful
"""
hello = r"This is a rather long string containing\n\
several lines of text much as you would do in C."
print hello






v = 20
v="kjugfihfk"
v=0.764576

a = ['spam', 'eggs', 100, 1234]
a[0]
a[-2]
a[1:-1]
a[:2] + ['bacon', 2*2]
3*a[:3] + ['Boo!']


a[2] = a[2] + 23




#while loop
while True:
    n = raw_input("Please enter 'hello':")
    if n.strip() == 'hello':
        break


a = ['Mary', 'had', 'a', 'little', 'lamb']
for i in range(len(a)):
    print i, a[i]




def primes(n) :
    for n in range(2, n) :
        for x in range(2, n) :
            if n % x == 0:
                break
            else:
                print n, 'is a prime number'



# Function defined outside the class
def f1(self, x, y):
    return min(x, x+y)

class C:
    f = f1
    def g(self):
        return 'hello world'
    h = g

varObj = C()
print varObj.f(2,10)
print varObj.h()

t = 12345, 54321, 'hello!'
print t[0]
print t
u = t, (1, 2, 3, 4, 5)
print u


empty = ()

x, y, z = t

print (x,y,z)
def swap(a,b):
   return b,a
a=2
b=5
a,b = swap (a,b)
print str(a) + ", " + str(b)

a, b = b, a

tel = {'jack': 4098, 'sape': 4139}
tel['guido'] = 4127
print tel['jack']
del tel['sape']   #delete it from list
print tel.keys()        #print all keys
print 'guido' in tel

x = 6

if x>1 and x<10:
    print "true"