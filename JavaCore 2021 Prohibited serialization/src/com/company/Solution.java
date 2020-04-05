package com.company;

/*

2021 Prohibited serialization
Disable serialization of the SubSolution class using NotSerializableException.
Class signatures cannot be changed.

Requirements:
1. The Solution class must support the Serializable interface.
2. The SubSolution class must be created inside the Solution class.
3. The SubSolution class must be a descendant of the Solution class.
4. An NotSerializableException exception should occur when attempting to serialize an object of type SubSolution.
5. When trying to deserialize an object of type SubSolution, the NotSerializableException exception should occur.


 */

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        private void writeObject(ObjectOutputStream out) throws IOException {
            throw new NotSerializableException();
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            throw new NotSerializableException();
        }

    }

    public static void main(String[] args) {

    }
}

