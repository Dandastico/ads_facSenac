import sys

def main():
    nums = input("Digite números inteiros separados por vírgula: ")
    nums = nums.split(',')
    for i in range(len(nums)):
        nums[i] = nums[i].strip()
    nums.sort()

    for num in nums:
        print(num)


if __name__ == "__main__":
    main()