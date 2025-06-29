package ex02_Java_Basics;

public class Lab023_Byte {

    public static void main(String[] args) {
        byte age = 10; // Decimal System - base = 10
        // 10 -> 000001010 -> 8 Bits -> 127


/*🧠 Step-by-Step Breakdown:
✅ 1. Variable Declaration

        byte a;
        You're telling the Java compiler:
        ➤ "Reserve 1 byte (8 bits) of memory to store an integer value."

        The variable name is a.

        The type byte is a primitive data type in Java.

✅ 2. Value Assignment
        a = 10;
        You store the value 10 inside that reserved memory location.

        10 in binary (8 bits) is: 00001010

        💾 Memory Representation
        Variable Name	Type	Size in Memory	Stored Value (Decimal)	Stored Value (Binary)
        a	            byte	1 byte (8 bits)	10	                    00001010

        📌 Important Notes
        A byte in Java can hold values from -128 to +127.

        It uses two's complement representation internally.

        Java stores primitive types like byte on the stack (if it's a local variable), not heap.

        🧪 What happens in memory?
        Java assigns a memory address for a (e.g., 0x1000 — just an example).

        At that address, it stores the binary 00001010.*/

    }


}
