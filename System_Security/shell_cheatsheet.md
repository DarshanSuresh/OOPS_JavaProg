# Shell Script Exam Cheat Sheet - Quick Reference

## 1. BASIC SYNTAX

### Input/Output
```bash
read -p "Prompt: " variable           # Read with prompt
read variable < file.txt              # Read from file
echo "Text"                            # Output
printf "Format %d\n" value           # Formatted output
```

### Variables
```bash
var=value                              # Assign variable
${var}                                 # Use variable
${#var}                                # Length of string
${var:0:5}                             # Substring (from 0, length 5)
${var:${#var}-1}                       # Last character
```

---

## 2. ARITHMETIC OPERATIONS

```bash
$((expression))                        # Arithmetic evaluation
$((num1 + num2))                       # Addition
$((num1 - num2))                       # Subtraction
$((num1 * num2))                       # Multiplication
$((num1 / num2))                       # Division
$((num1 % num2))                       # Modulo
$((base ** exp))                       # Exponentiation
```

---

## 3. CONDITIONALS

### If-Else Structure
```bash
if [ condition ]; then
    command
elif [ condition ]; then
    command
else
    command
fi
```

### Numeric Comparisons
```bash
-eq     # Equal to
-ne     # Not equal to
-lt     # Less than
-le     # Less than or equal
-gt     # Greater than
-ge     # Greater than or equal
-z      # String is empty
-n      # String is not empty
```

### String Comparisons
```bash
=       # Equal
!=      # Not equal
-n      # Non-empty
-z      # Empty
```

### File Tests
```bash
-f      # Regular file exists
-d      # Directory exists
-e      # File exists
-r      # File is readable
-w      # File is writable
-x      # File is executable
```

### Logical Operators
```bash
&&      # AND
||      # OR
!       # NOT
```

---

## 4. LOOPS

### For Loop
```bash
for ((i=1; i<=10; i++)); do
    echo $i
done

for item in list; do
    echo $item
done
```

### While Loop
```bash
while [ $i -lt 10 ]; do
    ((i++))
done
```

### Until Loop
```bash
until [ $i -eq 10 ]; do
    ((i++))
done
```

### Break and Continue
```bash
break       # Exit loop
continue    # Skip iteration
```

---

## 5. STRINGS

### String Operations
```bash
${string}               # Get string value
${#string}              # Length
${string:start:length}  # Substring
${string//old/new}      # Replace all
${string/old/new}       # Replace first
${string#pattern}       # Remove prefix
${string%pattern}       # Remove suffix
```

### String Commands
```bash
echo "$str" | rev                  # Reverse string
echo "$str" | tr '[:lower:]' '[:upper:]'  # Uppercase
echo "$str" | tr '[:upper:]' '[:lower:]'  # Lowercase
echo "$str" | wc -w               # Word count
echo "$str" | wc -c               # Character count
echo "$str" | grep -o .           # Split into chars
```

---

## 6. ARRAYS

### Array Declaration and Access
```bash
declare -a array=(1 2 3 4 5)      # Declare array
array[0]=value                      # Set element
${array[0]}                         # Get element
${array[@]}                         # All elements
${#array[@]}                        # Array length
${array[@]:2:3}                     # Slice (from 2, length 3)
```

### Array Iteration
```bash
for item in "${array[@]}"; do
    echo $item
done

for ((i=0; i<${#array[@]}; i++)); do
    echo "${array[$i]}"
done
```

### Associative Arrays
```bash
declare -A map
map[key]=value
echo "${map[key]}"
for key in "${!map[@]}"; do
    echo $key ${map[$key]}
done
```

---

## 7. FUNCTIONS

### Function Definition and Call
```bash
function my_function {
    echo "Arguments: $@"
    echo "Count: $#"
    return 0
}

my_function arg1 arg2
```

### Parameters
```bash
$0      # Script name
$1, $2  # Arguments
$@      # All arguments as array
$*      # All arguments as string
$#      # Number of arguments
```

---

## 8. CASE STATEMENTS

```bash
case $var in
    value1)
        command
        ;;
    value2)
        command
        ;;
    *)
        default_command
        ;;
esac
```

---

## 9. COMMONLY USED COMMANDS

### String Manipulation
```bash
rev                 # Reverse
tr 'a-z' 'A-Z'     # Translate characters
sort                # Sort lines
grep                # Search pattern
sed 's/old/new/'   # Stream editor
awk                 # Text processing
wc                  # Word/line count
cut                 # Cut columns
```

### Number Operations
```bash
seq 1 10            # Generate sequence
expr 5 + 3          # Arithmetic (old style)
dc                  # Calculator
bc                  # Calculator with decimals
```

### File Operations
```bash
ls                  # List files
cat                 # Display file
grep                # Search in file
wc -l               # Count lines
head                # First lines
tail                # Last lines
```

---

## 10. FREQUENTLY ASKED PROGRAMS

### Must Know:
1. **Factorial** - Loop with multiplication
2. **Fibonacci** - Series generation
3. **Prime Checker** - Loop and modulo
4. **Palindrome** - String reversal
5. **Pattern** - Nested loops
6. **Search** - Linear/Binary search
7. **Sort** - Bubble sort algorithm
8. **String Operations** - Reversal, length
9. **Array Operations** - Sum, max, min
10. **Conversions** - Binary, Decimal, Temperature

---

## 11. DEBUGGING TIPS

```bash
bash -x script.sh               # Debug mode (trace execution)
set -x                          # Enable debugging
set +x                          # Disable debugging
echo "Debug: $var"              # Print variable value

# Check syntax without executing
bash -n script.sh
```

---

## 12. COMMON MISTAKES & FIXES

| Issue | Solution |
|-------|----------|
| Space around = in assignment | No spaces: `var=value` |
| Missing $ for variable | Use: `${var}` or `$var` |
| Arithmetic in [ ] | Use: `$(( ))` instead |
| Loop counter not incrementing | Use: `((i++))` or `i=$((i+1))` |
| Array element undefined | Check array initialization |
| String comparison fails | Quote strings: `"$str"` |
| File not found | Check path and permissions |

---

## 13. QUICK CODING PATTERNS

### Count Occurrences in String
```bash
echo "$str" | grep -o "pattern" | wc -l
```

### Check if Number is Even
```bash
if [ $((num % 2)) -eq 0 ]; then echo "Even"; fi
```

### Swap Two Variables
```bash
temp=$a; a=$b; b=$temp
```

### Check if Array Contains Element
```bash
[[ " ${array[@]} " =~ " $element " ]]
```

### Extract Digits from Number
```bash
while [ $n -gt 0 ]; do
    digit=$((n % 10))
    n=$((n / 10))
done
```

### Generate Factorial
```bash
factorial=1
for ((i=1; i<=n; i++)); do
    factorial=$((factorial * i))
done
```

### Reverse a String
```bash
echo "$string" | rev
```

### Count Vowels
```bash
echo "$str" | grep -o '[aeiou]' | wc -l
```

---

## 14. SCRIPT TEMPLATE

```bash
#!/bin/bash

# Script description
# Author: Your Name
# Date: YYYY-MM-DD

# Enable strict mode (optional)
set -euo pipefail

# Constants
readonly SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

# Main function
main() {
    local var1="$1"

    if [ -z "$var1" ]; then
        echo "Usage: $0 argument"
        return 1
    fi

    # Your code here
    echo "Processing: $var1"
}

# Call main function
main "$@"
```

---

## 15. EXAM PREPARATION CHECKLIST

✓ Master basic syntax (read, echo, variables)
✓ Practice arithmetic operations
✓ Understand all conditionals
✓ Practice loops (for, while, until)
✓ Learn string operations
✓ Understand array operations
✓ Practice factorial, Fibonacci
✓ Practice pattern programs
✓ Practice search algorithms
✓ Practice sorting algorithms
✓ Master string manipulations
✓ Test edge cases (0, negative, empty)
✓ Debug and trace execution
✓ Write clean, commented code

---

**Last Updated**: 2025
**Focus Areas**: Loops, Conditionals, Strings, Arrays, Algorithms
