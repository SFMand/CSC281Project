# Binary Modular Exponentiation
In cryptography, it  is important to be able to find $(b^n\mod m)$ efficiently, where `b`, `n`, and `m` are large integers.

## Algorithm Explanation, and How It Works
### The Problem
Calculating $(b^n \mod m)$ is inefficient, slow, and prone to overflow in computer systems.
### How The Algorithm Works
The algorithm solves the three problems by being $O(\log n)$ and keeping all numbers small and easy to calculate.

It relies on two properties:
1. **Modular Arithmetic Property:** The modulus operator can be applied at each step of a multiplication.
    * $(a * b) \mod m \equiv ((a \mod m) * (b \mod m)) \mod m$
    * This means we can calculate $(b * b)\mod m$ at each step instead of letting the number become too big to calculate and cause overflow to the computer system.

2. **Binary Representation of the Exponent:** We can express any exponent `n` as a sum of powers of 2 (which is its binary representation).
    * For example, let's calculate $b^{11}$.
    * The exponent is $11$, which is **`1011`** in binary.
     $$11 = (1 \times 2^3) + (0 \times 2^2) + (1 \times 2^1) + (1 \times 2^0)  = 8 + 2 + 1 $$
    * Therefore, $b^{11} = b^{(8 + 2 + 1)} = b^8 \times b^2\times b^1$.
## AI usage
Generative AI, specifically Gemini 2.5, was used to only design and stylize this README.md, and not the actual contents of this file or the source code.
## Instructions on how to run
### Prerequisite
- any JDK (Version 8 or higher)
### Running the algorithm
1. Open newly extracted folder in an IDE
2. find src/Main.java and run