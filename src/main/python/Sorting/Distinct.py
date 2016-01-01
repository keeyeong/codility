import ktanlib

def solution1(A):
	if len(A) == 0:
		return 0
	B = sorted(A)
	count = 1
	prev = B[0]
	for i in range(1, len(A)):
		if B[i] != prev:
			prev = B[i]
			count += 1
	return count

def main():
	A = [2, 1, 1, 2, 3, 1]
	B = ktanlib.generate_random_array(-1000000, 1000000, 100000)
	print solution1(A) 
	print solution1([]) 
	print solution1([0]) 
	print solution1(B) 
	# print solution1(ktanlib.generate_random_array(0,1,1000000))
	# print ktanlib.prefix_sum([0,1,0,1,0,1]) # 6

if __name__ == "__main__":
		main()
