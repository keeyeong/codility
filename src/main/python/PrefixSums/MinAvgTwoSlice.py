import ktanlib

def solution1(A):
	temp = [0] * len(A)
	temp[0] = A[0]
	for i in range(1, len(A)):
		temp[i] = (temp[i - 1] * i + A[i]) / float(i + 1)
		print i, temp[i]
	return temp

def solution2(A):
	temp = [0] * len(A)
	temp[-1] = A[-1]
	smallest = temp[-1]
	for i in range(len(A) - 1, -1, -1):
		temp[i - 1] = (temp[i] * (len(A) - i) + A[i - 1]) / float(len(A) - i + 1)
		print i, temp[i - 1]
	return temp

def main():
	A = [4, 2, 2, 5, 1, 5, 8]
	# print solution1(A) # 1
	print solution2(A)  # 1
	# print solution1(ktanlib.generate_random_array(0,1,1000000))
	# print ktanlib.prefix_sum([0,1,0,1,0,1]) # 6

if __name__ == "__main__":
		main()
