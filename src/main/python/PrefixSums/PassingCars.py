import ktanlib

def solution1(A):
	direction = 0
	counter = 0
	passes = 0
	for i in range(len(A)):
		if A[i] == direction:
			counter += 1
		else:
			passes += counter
		if passes > 1000000000:
			return -1
	return passes

def solution2(A):
		west = 0  # The number of west-driving cars so far
		passing = 0  # The number of passing
 
		for index in range(len(A) - 1, -1, -1):
				# Travel the list from the end to the beginning
				if A[index] == 0:  # A east-driving car
						passing += west
						if passing > 1000000000:
								return -1
				else:  # A west-driving car
						west += 1
 
		return passing

def prefix_sum(A):
	result = [0] * len(A)
	result[0] = A[0]
	for i in range(1, len(A)):
		result[i] = result[i - 1] + A[i]
	return result

def main():
	print solution1([0, 1])  # 1
	print solution2([0, 1])  # 1
	print solution1([1, 0])  # 1
	print solution2([1, 0])  # 1
	print solution1([0, 1, 0, 1, 1])  # 5
	print solution1([1, 1, 0, 1, 0, 1, 1])  # 5
	print solution1([0, 0, 0, 1, 1, 1])  # 9
	print solution1([0, 1, 0, 1, 0, 1])  # 6
	print solution1(ktanlib.generate_random_array(0, 1, 1000000))
	# print ktanlib.prefix_sum([0,1,0,1,0,1]) # 6

if __name__ == "__main__":
		main()
