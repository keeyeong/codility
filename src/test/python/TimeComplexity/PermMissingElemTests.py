import unittest
import PermMissingElem

class PermMissingElemTests(unittest.TestCase):

    def testExample(self):
        self.assertEqual(4, PermMissingElem.solution([2, 3, 1, 5]), "Example [2, 3, 1, 5]")

def main():
    unittest.main()

if __name__ == '__main__':
    main()
