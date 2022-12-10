import java.io.*;
import java.util.*;

//Marc Lawrence C. Magadan
//     BSIT - 1B

public class ArrayActivity {
  static Scanner sc = new Scanner(System.in);
  static int[] array;
  static int idx;
  static int size;
  static int cnt;

  public ArrayActivity(int _size) {
    size = _size;
    array = new int[size];
    idx = -1;
    cnt = 0;
  }

  static boolean isFull() {
    return cnt >= size;
  }

  static boolean isEmpty() {
    return cnt <= 0;
  }

  static void add(int value) {
    if (!isFull()) {
      array[++idx] = value;
      cnt++;
    } else {
      System.out.println("Array is full!");
    }
  }

  // Method to remove an element from the array
  static void remove() {
    if (!isEmpty()) {
      // Shift all elements after the last element one position to the left
      for (int i = idx; i < cnt - 1; i++) {
        array[i] = array[i + 1];
      }
      // Decrement the index and count
      idx--;
      cnt--;
    } else {
      System.out.println("Array is empty!");
    }
  }

  static int count() {
    return cnt;
  }

  // Method to search for an element in the array
  static void search(int value) {
    // Iterate over the array
    for (int i = 0; i < cnt; i++) {
      // If the element is found, print the index and return
      if (array[i] == value) {
        System.out.println("Element found at index: " + i);
        return;
      }
    }
    // If the element is not found, print a message
    System.out.println("Element not found in array");
  }

  static void display() {
    for (int i = 0; i < cnt; i++) {
      System.out.println("[" + array[i] + "]");
    }
  }

  public static void main(String[] args) {
    int _size, opt, value;
    System.out.print("Input array size: ");
    _size = sc.nextInt();
    ArrayActivity aa = new ArrayActivity(_size);

    while (true) {
      System.out.println("1. ADD  2. DISPLAY    3. DELETE     4. COUNT    5. SEARCH      6. EXIT ");
      System.out.print("Enter Option: ");
      opt = sc.nextInt();

      switch (opt) {
        case 1:
          for (int i = 0; i < _size; i++) {
            System.out.print("Add value: ");
            value = sc.nextInt();
            add(value);
          }
          break;
        case 2:
  display();
  break;
case 3:
  remove();
  break;
case 4:
  System.out.println("Number of elements in array: " + count());
  break;
case 5:
  System.out.print("Enter search value: ");
  value = sc.nextInt();
  search(value);
  break;
case 6:
  System.out.println("Exiting program...");
  System.exit(0);
  break;
default:
  System.out.println("Invalid option!");
  break;
      }
     }
    }
    }

   

   
