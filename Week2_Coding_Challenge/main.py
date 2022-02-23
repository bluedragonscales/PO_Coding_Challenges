# Take the number 192 and multiply it by each of 1, 2, and 3:
# 192 × 1 = 192
# 192 × 2 = 384
# 192 × 3 = 576
# By concatenating each product, we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated
# product of 192 and (1,2,3). The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5,giving
# the pandigital, 918273645, which is the concatenated product of 9 and(1,2,3,4,5). What is the largest 1 to 9
# pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n >1?

def pan_number(num):

    number_string = str(num)
    digits = []

    for n in number_string:
        if n in digits:
            return False
        else:
            digits.append(n)

    sorted_list = sorted(digits)
    first_digit = int(sorted_list[0])
    last_digit = int(sorted_list[-1])
    list_length = len(sorted_list)

    if first_digit != 0 and first_digit == 1:
        if last_digit == list_length:
            return True
        else:
            return False
    else:
        return False



def largest_pan(num):

    str_num = str(num)
    num_length = len(str_num)
    pan_num: str = ""

    for digit in range(1, num_length + 1):
        num_str = str(num * digit)
        pan_num += num_str

    return pan_num


goal_pan: bool = pan_number(largest_pan(192))
if goal_pan:
    print(largest_pan(192))
else:
    print(False)
