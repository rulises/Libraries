import math



#Check Prime
def isPrime(n):
	m = math.sqrt(n)
	if n == 1 OR n == 2:
		return True
	if n % 2 == 0:
		return False
	for i in xrange(3, m ,2):
		if n % i == 0:
			return False 
	return True

#GCD
def gcd(n, m):
	if(m == 0): 
		return n
	return gcd(m,n%m)

#LCM
def lcm(n,m):
	return m*n/gcd(n,m)
