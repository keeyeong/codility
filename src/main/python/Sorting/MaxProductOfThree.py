import ktanlib

def solution1(A):
	B = sorted(A)
	print B[-1], B[-2], B[-3]
	return max([B[-1] * B[-2] * B[-3], B[0] * B[1] * B[-1]])

def main():
	A = [-3, 1, 2, -2, 5, 6]
	B = ktanlib.generate_random_array(-1000, 1000, 10)
	# print B
	print solution1(B)  # 1
	# print solution1(ktanlib.generate_random_array(0,1,1000000))
	# print ktanlib.prefix_sum([0,1,0,1,0,1]) # 6

if __name__ == "__main__":
		main()
