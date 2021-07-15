# Cracking
Solving problems.

## Problems
### Arrays and strings
- Determining if a string has all [unique characters](src/main/java/com/xenoteo/chapter1_arrays_and_strings/question1_1_is_unique/Solution.java)
  (+[tests](src/test/java/com/xenoteo/chapter1_arrays_and_strings/question1_1_is_unique/SolutionTest.java)).
- Given two strings determining if one [is a permutation](src/main/java/com/xenoteo/chapter1_arrays_and_strings/question1_2_check_permutation/Solution.java) of the other 
  (+[tests](src/test/java/com/xenoteo/chapter1_arrays_and_strings/question1_2_check_permutation/SolutionTest.java)).
- Given a string [replacing](src/main/java/com/xenoteo/chapter1_arrays_and_strings/question1_3_urlify/Solution.java) all its spaces with '%20' 
  (+[tests](src/test/java/com/xenoteo/chapter1_arrays_and_strings/question1_3_urlify/SolutionTest.java)).
- Given a string checking if it [is a permutation](src/main/java/com/xenoteo/chapter1_arrays_and_strings/question1_4_palindrome_permutation/Solution.java) of a palindrome 
  (+[tests](src/test/java/com/xenoteo/chapter1_arrays_and_strings/question1_4_palindrome_permutation/SolutionTest.java)).
- There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. 
  Given two strings check if they are [one edit](src/main/java/com/xenoteo/chapter1_arrays_and_strings/question1_5_one_away/Solution.java) (or zero edits) away
  (+[tests](src/test/java/com/xenoteo/chapter1_arrays_and_strings/question1_5_one_away/SolutionTest.java)).
- Performing basic [string compression](src/main/java/com/xenoteo/chapter1_arrays_and_strings/question1_6_string_compression/Solution.java) 
  using the counts of repeated characters. If the "compressed" string would not become smaller than the original string, 
  method should return the original string (+[tests](src/test/java/com/xenoteo/chapter1_arrays_and_strings/question1_6_string_compression/SolutionTest.java)).
- Given an image represented by an NxN matrix [rotating](src/main/java/com/xenoteo/chapter1_arrays_and_strings/question1_7_rotate_matrix/Solution.java) 
  the image by 90 degrees (+[tests](src/test/java/com/xenoteo/chapter1_arrays_and_strings/question1_7_rotate_matrix/SolutionTest.java)).
- [Reviewing a matrix](src/main/java/com/xenoteo/chapter1_arrays_and_strings/question1_8_zero_matrix/Solution.java) 
  such that if an element in an MxN matrix is 0, its entire row and column are set to 0 
  (+[tests](src/test/java/com/xenoteo/chapter1_arrays_and_strings/question1_8_zero_matrix/SolutionTest.java)).
- Given two strings checking if the second [is a rotation](src/main/java/com/xenoteo/chapter1_arrays_and_strings/question1_9_string_rotation/Solution.java) 
  of the first using only one call to contains() (+[tests](src/test/java/com/xenoteo/chapter1_arrays_and_strings/question1_9_string_rotation/SolutionTest.java)).

### Linked Lists
- [Removing duplicates](src/main/java/com/xenoteo/chapter2_linked_lists/question2_1_remove_dups/Solution.java) 
  from an unsorted [linked list](src/main/java/com/xenoteo/helpers/linked_list) 
  (+[tests](src/test/java/com/xenoteo/chapter2_linked_lists/question2_1_remove_dups/SolutionTest.java)).
- Finding the [kth to last](src/main/java/com/xenoteo/chapter2_linked_lists/question2_2_return_kth_to_last/Solution.java) 
  element of a singly linked list (+[tests](src/test/java/com/xenoteo/chapter2_linked_lists/question2_2_return_kth_to_last/SolutionTest.java)).
- [Deleting a middle node](src/main/java/com/xenoteo/chapter2_linked_lists/question2_3_delete_middle_node/Solution.java) 
  of a singly linked list, given only access to that node (+[tests](src/test/java/com/xenoteo/chapter2_linked_lists/question2_3_delete_middle_node/SolutionTest.java)).
- [Partition](src/main/java/com/xenoteo/chapter2_linked_lists/question2_4_partition/Solution.java) 
  of a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x 
  (+[tests](src/test/java/com/xenoteo/chapter2_linked_lists/question2_4_partition/SolutionTest.java)).
- [Adding](src/main/java/com/xenoteo/chapter2_linked_lists/question2_5_sum_lists) the two numbers 
  represented by a linked list (+[tests](src/test/java/com/xenoteo/chapter2_linked_lists/question2_5_sum_lists/SolutionTest.java)).
- Checking if a linked list [is a palindrome](src/main/java/com/xenoteo/chapter2_linked_lists/question2_6_palindrome/Solution.java) 
  (+[tests](src/test/java/com/xenoteo/chapter2_linked_lists/question2_6_palindrome/SolutionTest.java)).
- Given two singly linked lists, determining if they [intersect](src/main/java/com/xenoteo/chapter2_linked_lists/question2_7_intersection/Solution.java)
  and returning the intersecting node (+[tests](src/test/java/com/xenoteo/chapter2_linked_lists/question2_7_intersection/SolutionTest.java)).
- Given a [circular linked list](src/main/java/com/xenoteo/chapter2_linked_lists/question2_8_loop_detection/Solution.java), 
  returning the node at the beginning of the loop (+[tests](src/test/java/com/xenoteo/chapter2_linked_lists/question2_8_loop_detection/SolutionTest.java)).

### Stacks and queues
- Implementing [three stacks](src/main/java/com/xenoteo/chapter3_stacks_and_queues/question3_1_three_in_one/Stack.java) 
  using a single array (+[tests](src/test/java/com/xenoteo/chapter3_stacks_and_queues/question3_1_three_in_one/StackTest.java)).
- Implementing inked list based stack which has a function [min](src/main/java/com/xenoteo/chapter3_stacks_and_queues/question3_2_stack_min/Stack.java) 
  returning the minimum element. Push, pop and min operate in 0(1) time 
  (+[tests](src/test/java/com/xenoteo/chapter3_stacks_and_queues/question3_2_stack_min/StackTest.java)).
- Implementing set of limited stacks. [Set of stacks](src/main/java/com/xenoteo/chapter3_stacks_and_queues/question3_3_stack_of_plates) 
  is composed of several stacks and creates a new stack once the previous one exceeds capacity 
  (+[tests](src/test/java/com/xenoteo/chapter3_stacks_and_queues/question3_3_stack_of_plates)).
- Implementing a [queue using two stacks](src/main/java/com/xenoteo/chapter3_stacks_and_queues/question3_4_queue_via_stacks/Queue.java) 
  (+[tests](src/test/java/com/xenoteo/chapter3_stacks_and_queues/question3_4_queue_via_stacks/QueueTest.java)).
- Implementing [stack sort](src/main/java/com/xenoteo/chapter3_stacks_and_queues/question3_5_sort_stack) such that the smallest items
  are on the top (+[tests](src/test/java/com/xenoteo/chapter3_stacks_and_queues/question3_5_sort_stack/SortTest.java)).
  - [Insertion sort](src/main/java/com/xenoteo/chapter3_stacks_and_queues/question3_5_sort_stack/InsertionSort.java) 
    (+[tests](src/test/java/com/xenoteo/chapter3_stacks_and_queues/question3_5_sort_stack/InsertionSortTest.java)).
  - [Insertion sort with additional buffer](src/main/java/com/xenoteo/chapter3_stacks_and_queues/question3_5_sort_stack/InsertionSortWithBuff.java) 
    (+[tests](src/test/java/com/xenoteo/chapter3_stacks_and_queues/question3_5_sort_stack/InsertionSortWithBuffTest.java)).
  - [Merge sort](src/main/java/com/xenoteo/chapter3_stacks_and_queues/question3_5_sort_stack/MergeSort.java) 
    (+[tests](src/test/java/com/xenoteo/chapter3_stacks_and_queues/question3_5_sort_stack/MergeSortTest.java)).
  - [Quick sort](src/main/java/com/xenoteo/chapter3_stacks_and_queues/question3_5_sort_stack/QuickSort.java) 
    (+[tests](src/test/java/com/xenoteo/chapter3_stacks_and_queues/question3_5_sort_stack/QuickSortTest.java)).
- Implementing queue based [animal shelter](src/main/java/com/xenoteo/chapter3_stacks_and_queues/question3_6_animal_shelter/AnimalShelter.java) 
  (+[tests](src/test/java/com/xenoteo/chapter3_stacks_and_queues/question3_6_animal_shelter/AnimalShelterTest.java)).

### Trees and graphs
- Given a directed graph finding out whether there is a [route between two nodes](src/main/java/com/xenoteo/chapter4_trees_and_graphs/question4_1_route_between_nodes/Solution.java) 
  (+[tests](src/test/java/com/xenoteo/chapter4_trees_and_graphs/question4_1_route_between_nodes/SolutionTest.java)).
- Given a sorted (increasing order) array with unique integer elements, creating a binary search 
  [tree with minimal height](src/main/java/com/xenoteo/chapter4_trees_and_graphs/question4_2_minimal_tree/Solution.java) 
  (+[tests](src/test/java/com/xenoteo/chapter4_trees_and_graphs/question4_2_minimal_tree/SolutionTest.java)).
- Given a binary tree, creating a linked [list of all the nodes at each depth](src/main/java/com/xenoteo/chapter4_trees_and_graphs/question4_3_list_of_depths/Solution.java) 
  (+[tests](src/test/java/com/xenoteo/chapter4_trees_and_graphs/question4_3_list_of_depths/SolutionTest.java)).
- Checking if a binary tree [is balanced](src/main/java/com/xenoteo/chapter4_trees_and_graphs/question4_4_check_balanced/Solution.java) 
  (+[tests](src/test/java/com/xenoteo/chapter4_trees_and_graphs/question4_4_check_balanced/SolutionTest.java)).
- Checking if a binary tree [is a binary search tree](src/main/java/com/xenoteo/chapter4_trees_and_graphs/question4_5_validate_bst/Solution.java) 
  (+[tests](src/test/java/com/xenoteo/chapter4_trees_and_graphs/question4_5_validate_bst/SolutionTest.java)).
- Finding an in-order [successor](src/main/java/com/xenoteo/chapter4_trees_and_graphs/question4_6_successor/Solution.java) 
  of a given node in a binary search tree (+[tests](src/test/java/com/xenoteo/chapter4_trees_and_graphs/question4_6_successor/SolutionTest.java)).
- Given a list of projects and a list of dependencies, finding a [build order](src/main/java/com/xenoteo/chapter4_trees_and_graphs/question4_7_build_order/Solution.java) 
  that will allow the projects to be built (+[tests](src/test/java/com/xenoteo/chapter4_trees_and_graphs/question4_7_build_order/SolutionTest.java)).
- Finding the [first common ancestor](src/main/java/com/xenoteo/chapter4_trees_and_graphs/question4_8_first_common_ancestor)
  of two nodes in a binary tree (+[tests](src/test/java/com/xenoteo/chapter4_trees_and_graphs/question4_8_first_common_ancestor/ISolutionTest.java)).
- Given a binary search tree with distinct elements, finding all possible 
  [BST sequences](src/main/java/com/xenoteo/chapter4_trees_and_graphs/question4_9_bst_sequences/Solution.java) 
  (arrays) that could have led to this tree (+[tests](src/test/java/com/xenoteo/chapter4_trees_and_graphs/question4_9_bst_sequences/SolutionTest.java)).
- Determining if T2 [is a subtree](src/main/java/com/xenoteo/chapter4_trees_and_graphs/question4_10_check_subtree/Solution.java) of T1
  (+[tests](src/test/java/com/xenoteo/chapter4_trees_and_graphs/question4_10_check_subtree/SolutionTest.java)).
- Implementation of a [BST class](src/main/java/com/xenoteo/chapter4_trees_and_graphs/question4_11_random_node/bst_base/IBSTNode.java) 
  from scratch which, in addition to insert, find, and delete, has a method [getRandomNode()](src/main/java/com/xenoteo/chapter4_trees_and_graphs/question4_11_random_node)
  which returns a random node from the tree.
- Given a binary tree in which each node contains an integer value (which might be positive or negative), 
  counting the number of [paths that sum](src/main/java/com/xenoteo/chapter4_trees_and_graphs/question4_12_path_with_sum/Solution.java) 
  to a given value (+[tests](src/test/java/com/xenoteo/chapter4_trees_and_graphs/question4_12_path_with_sum/SolutionTest.java)).

### Bit manipulation
- Given two 32-bit numbers, N and M, and two bit positions, i and j; [inserting](src/main/java/com/xenoteo/chapter5_bit_manipulation/question5_1_insertion/Solution.java) 
  M into N such that M starts at bit j and ends at bit i 
  (+[tests](src/test/java/com/xenoteo/chapter5_bit_manipulation/question5_1_insertion/SolutionTest.java)).
- Given a real number between O and 1 (e.g., 0.72) that is passed in as a double, finding its 
  [binary representation](src/main/java/com/xenoteo/chapter5_bit_manipulation/question5_2_binary_to_string/Solution.java) 
  (+[tests](src/test/java/com/xenoteo/chapter5_bit_manipulation/question5_2_binary_to_string/SolutionTest.java)).
- Finding the length of the [longest sequence of 1s](src/main/java/com/xenoteo/chapter5_bit_manipulation/question5_3_flip_bit_to_win/Solution.java) 
  is possible to create after flipping exactly one bit from 0 to 1 
  (+[tests](src/test/java/com/xenoteo/chapter5_bit_manipulation/question5_3_flip_bit_to_win/SolutionTest.java)).
- Finding [the next](src/main/java/com/xenoteo/chapter5_bit_manipulation/question5_4_next_number/Solution.java) 
  smallest and the next largest number that have the same number of 1 bits in their binary representation 
  (+[tests](src/test/java/com/xenoteo/chapter5_bit_manipulation/question5_4_next_number/SolutionTest.java)).
- Determining the number of bits needed to flip [to convert](src/main/java/com/xenoteo/chapter5_bit_manipulation/question5_6_conversion/Solution.java) 
  integer A to integer B (+[tests](src/test/java/com/xenoteo/chapter5_bit_manipulation/question5_6_conversion/SolutionTest.java)).
- [Swapping](src/main/java/com/xenoteo/chapter5_bit_manipulation/question5_7_pairwise_swap/Solution.java) odd and even bits in an integer 
  (+[tests](src/test/java/com/xenoteo/chapter5_bit_manipulation/question5_7_pairwise_swap/SolutionTest.java)).
- [Drawing a horizontal line](src/main/java/com/xenoteo/chapter5_bit_manipulation/question5_8_draw_line/Solution.java) 
  on a monochrome screen represented by bits (+[tests](src/test/java/com/xenoteo/chapter5_bit_manipulation/question5_8_draw_line/SolutionTest.java)).

## Helpers
- Simple [linked list](src/main/java/com/xenoteo/helpers/linked_list/List.java) implementation based on 
  [nodes](src/main/java/com/xenoteo/helpers/linked_list/Node.java) and 
  [generator](src/main/java/com/xenoteo/helpers/linked_list/ListGenerator.java) for generating linked lists from an array.
- Simple [linked list based stack](src/main/java/com/xenoteo/helpers/stack/Stack.java) and 
  [stack with limited capacity](src/main/java/com/xenoteo/helpers/stack/StackLimited.java), using the same 
  [interface](src/main/java/com/xenoteo/helpers/stack/IStack.java) 
  (+[tests](src/test/java/com/xenoteo/helpers/stack)).
  - [FullStackException](src/main/java/com/xenoteo/helpers/stack/exceptions/FullStackException.java) to indicate that a stack is full.
  - Abstract class for easier and more optimal [testing of different stacks](src/test/java/com/xenoteo/helpers/stack/IStackTest.java).
- [Interface for queues](src/main/java/com/xenoteo/helpers/queue/IQueue.java).
  - [EmptyQueueException](src/main/java/com/xenoteo/helpers/queue/exceptions/EmptyQueueException.java) to indicate that a queue is empty.
  - Abstract class for easier and more optimal [testing of different queues](src/test/java/com/xenoteo/helpers/queue/IQueueTest.java).
- Adjacency list based [graph](src/main/java/com/xenoteo/helpers/graph).
- Simple binary [tree](src/main/java/com/xenoteo/helpers/tree).
  - [TreeNodeFactory](src/main/java/com/xenoteo/helpers/tree/TreeNodeFactory.java) for creating a tree node of a certain type.
