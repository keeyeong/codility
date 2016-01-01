import ktanlib

def solution1(A):
	B = sorted(A)
	for i in range(len(B) - 2, 0, -1):
		if B[i] + B[i + 1] > B[i - 1] and \
			 B[i + 1] + B[i - 1] > B[i] and \
			 B[i - 1] + B[i] > B[i + 1]:
			print B[i - 1], B[i], B[i + 1]
			return 1
	return 0
		

def main():
	A = [10, 2, 5, 1, 8, 20]
	B = ktanlib.generate_random_array(-100000, 100000, 100000)
	# print B
	print solution1(A)
	print solution1(B) 
	# print solution1(ktanlib.generate_random_array(0,1,1000000))
	# print ktanlib.prefix_sum([0,1,0,1,0,1]) # 6

if __name__ == "__main__":
		main()
