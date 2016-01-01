import random

def prefix_sum(A):
	result = [0] * len(A)
	result[0] = A[0]
	for i in range(1, len(A)):
		result[i] = result[i - 1] + A[i]
	return result

def generate_random_array(min, max, size):
	return [random.randint(min, max) for x in range(size)]
