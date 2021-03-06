package com.leetcode;

import com.leetcode.Arrays.*;
import com.leetcode.Deque.CircularDeque;
import com.leetcode.Graph.BFSUsingLinkedList;
import com.leetcode.Graph.DFSGraph;
import com.leetcode.Graph.GraphImplementationUsingAdjacencyList;
import com.leetcode.Graph.GraphImplementationUsingLinkedList;
import com.leetcode.Queue.ImplementQueueUsingArray;
import com.leetcode.Sorting.BubbleSort;
import com.leetcode.Sorting.MergeSort;
import com.leetcode.Sorting.QuickSort;
import com.leetcode.Stack.StackImplemenationUsingArray;
import com.leetcode.Stack.StackImplementationUsingArrayList;
import com.leetcode.Strings.*;
import com.leetcode.Tree.*;
import com.leetcode.list.LinkedList;
import com.leetcode.list.Node;
import com.leetcode.trie.Trie;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Invoking the RemoveDuplicatesFromArrayAndReturnLength Class
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicatesFromArrayAndReturnLength removeDups = new RemoveDuplicatesFromArrayAndReturnLength(nums);
        removeDups.removeDuplicates(nums);

        // Invoking the BestTimeToBuyAndSellStock Class

        int[] pricesArray1 = {7, 1, 5, 3, 6, 4};
        int[] pricesArray2 = {1, 2, 3, 4, 5};
        int[] pricesArray3 = {7, 6, 4, 3, 1};

        BestTimeToBuyAndSellStock profit = new BestTimeToBuyAndSellStock();
        profit.maxProfit(pricesArray1);
        profit.maxProfit(pricesArray2);
        profit.maxProfit(pricesArray3);

        // Invoking the RotateArray Class

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(array, k);

        // Invoking the containsDuplicates Class. (Checks if the Array has some duplicates.)
        int[] array1 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 2, 3, 1};


        ContainsDuplicates checkDuplicate = new ContainsDuplicates();
        checkDuplicate.containsDuplicates(array1);
        checkDuplicate.containDuplicatesWithHashSet(array3);
        checkDuplicate.containsDuplicates(array2);

        // Invoke SingleNumber Class( Find the number which is present only once in a array)

        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        SingleNumber number = new SingleNumber();
        System.out.println("The Single number in the given array " + Arrays.toString(nums1) + " is " + number.findSingleNumberByBitManipulation(nums1));
        System.out.println("The Single number in the given array " + Arrays.toString(nums2) + " is " + number.findSingleNumberUsingList(nums2));
        System.out.println("The Single number in the given array " + Arrays.toString(nums3) + " is " + number.findSingleNumberByBitManipulation(nums3));

        //Invoke Intersect Two Arrays

        int[] numberArray1 = {1, 2, 2, 1};
        int[] numberArray2 = {2, 2};
        IntersectionOfTwoArrays intersection = new IntersectionOfTwoArrays();
        System.out.println(" The Intersection of Two Arrays , Array 1 = " + Arrays.toString(numberArray1) + ", Array 2  = " + Arrays.toString(numberArray2) + " is " + Arrays.toString(intersection.intersectionOfTwoArrays(numberArray1, numberArray2)));


        //Invoke Plus One Class .
        int[] numsArray = {1, 2, 3};
        int[] numsArray1 = {9, 9, 9};

        PlusOne plusone = new PlusOne();
        System.out.println("The Input Array : " + Arrays.toString(numsArray) + " , The OutPut Array after adding one is : " + Arrays.toString(plusone.plusOneFunction(numsArray)));
        System.out.println("The Input Array : " + Arrays.toString(numsArray1) + " , The OutPut Array after adding one is : " + Arrays.toString(plusone.plusOneFunction(numsArray1)));

        //Invoke MoveZeroes

        int[] zeroArray1 = {0, 1, 0, 3, 12};
        int[] zeroArray2 = {0,0,0,5,4};

        MoveZeroes moveZeroes = new MoveZeroes();

        System.out.println("The Input Array : "+ Arrays.toString(zeroArray1));
        moveZeroes.moveZeroes(zeroArray1);
        System.out.println("The Output Array after moving zeroes : "+ Arrays.toString(zeroArray1));

        System.out.println("The Input Array : "+ Arrays.toString(zeroArray2));
        moveZeroes.moveZeroes(zeroArray2);
        System.out.println("The Output Array after moving zeroes : "+ Arrays.toString(zeroArray2));

        //Invoke TwoSum Class

        int[] sumArray1={2,7,11,15};
        int[] sumArray2={3,2,4};

        TwoSums sum = new TwoSums();
      int[] result1=  sum.twoSums(sumArray1 , 18);
      int[] result2=  sum.twoSums(sumArray2,7);

      System.out.println("The Input Array : "+Arrays.toString(sumArray1) +" , Target : 18 , Output Sum Array Positions : "+Arrays.toString(result1));
        System.out.println("The Input Array : "+Arrays.toString(sumArray2) +" , Target : 7 , Output Sum Array Positions : "+Arrays.toString(result2));

    // Invoke Sudoku Class

        char[][] board =
                {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        ValidSudoku sudoku = new ValidSudoku();
        System.out.println("The given Sudo board "+ Arrays.toString(board) +" is "+ sudoku.isValidSudoku(board));

        //Invoke RotateImage;

        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

        RotateImage rotateImage = new RotateImage();
        rotateImage.rotateImage(matrix);


        /*********************************************************************************************************************************
         * Strings
         *
         */

        //Invoke ReverseString Class

        ReverseString reverse = new ReverseString();
        char[] s={'h','e','l','l','o'};
        System.out.println("The Original Char Array is "+ Arrays.toString(s));
        System.out.println("The reversed string is "+ Arrays.toString(reverse.reverseString(s)));

        // Invoke ReverseInteger Class

        ReverseInteger reverseInteger = new ReverseInteger();
        int x=123;
        System.out.println("The Original Integer is " +x);
        System.out.println("The Reversed Integer is "+ reverseInteger.reverseInt(x));

        //Invoke FirstUniqueCharacter Class

        String str="leetcode";
        String str2="loveleetcode";
        FirstUniqueCharacter uniqueCharacter = new FirstUniqueCharacter();
        System.out.println("The first unique character in the string "+str+ " is "+uniqueCharacter.findFirstUniqueCharacter(str));
        System.out.println("The first unique character in the string "+str2+ " is "+uniqueCharacter.findFirstUniqueCharacter(str2));

        //Invoke Anagram

        String st= "anagram";
        String t="nagaram";
        Anagram anagram = new Anagram();
        System.out.println(" Are the strings '"+ st +"' , '"+t +"' anagrams ?" + anagram.isAnagram(st, t));
        st="cat";
        t="rat";
        System.out.println(" Are the strings '"+ st +"' , '"+t +"' anagrams ?" + anagram.isAnagram(st, t));

        //Invoke Trie Insert , Search and SEarchPrefix function;

        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("approve");
        trie.insert("air");
        trie.insert("bee");
        System.out.println(" The trie has the word bee : "+trie.search("bee") );
        System.out.println(" The trie has the word air : "+trie.search("air") );
        System.out.println(" The trie has the word approve : "+trie.search("approve") );
        System.out.println(" The trie has the word airstrike : "+trie.search("airstrike") );
        System.out.println(" The trie has the prefix bee : "+trie.searchPrefix("bee") );
        System.out.println(" The trie has the prefix ai : "+trie.searchPrefix("ai") );
        System.out.println(" The trie has the prefix approe : "+trie.searchPrefix("approe") );
        System.out.println(" The trie has the prefix airstrike : "+trie.searchPrefix("airstrike") );


        ///Invoke Reverse the LinkedList

        LinkedList list = new LinkedList();
        list.insertLinkedList(list,1);
        list.insertLinkedList(list,2);
        list.insertLinkedList(list,3);
        list.insertLinkedList(list,4);
        list.insertLinkedList(list,5);


         Node newHead=   list.reverseListRecursion(list.head);
        System.out.println("The reversed LinkedList is ");
        list.printLinkedList(newHead);


        Node node = list.reverseListIteration(newHead);
        System.out.println("The reversed LinkedList is ");
        list.printLinkedList(node);

        //Stack Implementation Using ArrayList

        StackImplementationUsingArrayList stack = new StackImplementationUsingArrayList(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(" ******** Stack After Pushing elements to it ********");
        stack.printStack();
        stack.pop();
        System.out.println(" ******** Stack After Popping elements to it ********");
        stack.printStack();
        System.out.println(" ******** Stack After Incrementing elements to it ********");
        stack.increment(1,100);
        stack.printStack();


        //Print Permutation of the String

        PermutationsOfString permutationsOfString = new PermutationsOfString();
        permutationsOfString.permutation("abcd");
        permutationsOfString.permutationWithoutDuplicates("abb");

        //ClimbStairs Problem

        ClimbStairs climbStairs = new ClimbStairs();
        System.out.println("The number of ways to climb stepsCount of 5 is "+ climbStairs.climbStairs(5));


        //CircularDeque
        CircularDeque deque = new CircularDeque(5);
        System.out.println(" deque.insertFront(0) : "+ deque.insertFront(0));
        System.out.println(" deque.insertLast(3) : "+  deque.insertLast(3));
        System.out.println(" deque.insertFront(1) : "+deque.insertFront(1));
        System.out.println(" deque.insertLast(4) : "+deque.insertLast(4));
        System.out.println(" deque.insertFront(2) : "+deque.insertFront(2));
        System.out.println(" deque.insertLast(7) : "+deque.insertLast(7));
        System.out.println(" deque.insertFront(7) : "+deque.insertFront(7));
        System.out.println(" deque.deleteFront() : "+ deque.deleteFront());
        System.out.println(" deque.deleteLast() : "+deque.deleteLast());
        System.out.println(" deque.getFront() : "+ deque.getFront());
        System.out.println(" deque.getLast() : "+deque.getLast());


        //ValidateBinarySearchTree
        TreeNode root = new TreeNode(0);
        TreeNode left1= new TreeNode(-3) ;
        TreeNode right1 = new TreeNode(9);
        TreeNode left2= new TreeNode(-10) ;
        TreeNode left3  = new TreeNode( 5);
        TreeNode right2 = new TreeNode(12);
       root.left = left1;
       root.right= right1;
       root.left.left = left2;
       root.right.left = left3;
       root.right.right = right2;

        ValidateBinarySearchTree bst = new ValidateBinarySearchTree();
        System.out.println("This is a valid BST : "+ bst.isValidBST(root));


        //SortedARraytoBST

        ImplementBST sortedArraytoBST = new ImplementBST();
        System.out.println(" The SortedArray to BST output is "+sortedArraytoBST.sortedArraytoBST(array));

        //InorderTraversal

        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        List<Integer> list1 = inOrderTraversal.inOrderTraversalRecursion(root);
        System.out.println(" The List returned after the inorderTraversal of BST using Recursion :");
        for(Integer temp : list1){
            System.out.println(temp);
        }
        List<Integer> list2= inOrderTraversal.inOrderTraversalIteration(root);
        System.out.println(" The List returned after the inorderTraversal of BST using Iteration :");
        for(Integer temp : list2){
            System.out.println(temp);
        }

        //MinDepth of BST

        MinDepthOfBST minDepthOfBST = new MinDepthOfBST();
        System.out.println("The minimum depth of the BST is : "+minDepthOfBST.findMinDepthOfBST(root));

        //MaxDepthOfBST
        MaxDepthOfBST maxDepthOfBST= new MaxDepthOfBST();
        System.out.println(" The Maximum depth of the BST is : "+maxDepthOfBST.findMaxDepthOfBST(root));


        //Implementation of Queue using Array
        ImplementQueueUsingArray implementQueueUsingArray = new ImplementQueueUsingArray(5);
        implementQueueUsingArray.display();
        implementQueueUsingArray.enQueue(5);
        implementQueueUsingArray.enQueue(10);
        implementQueueUsingArray.enQueue(15);
        implementQueueUsingArray.display();
        implementQueueUsingArray.queueDeque();
        implementQueueUsingArray.enQueue(20);
        implementQueueUsingArray.display();
        implementQueueUsingArray.enQueue(25);
        implementQueueUsingArray.enQueue(30);
         implementQueueUsingArray.enQueue(35);
        implementQueueUsingArray.display();
        implementQueueUsingArray.queueDeque();
        implementQueueUsingArray.queueDeque();
        implementQueueUsingArray.queueDeque();
        implementQueueUsingArray.queueDeque();
        implementQueueUsingArray.queueDeque();
        implementQueueUsingArray.enQueue(40);

        //Stack Implementation Using Array

        StackImplemenationUsingArray stackImplemenationUsingArray = new StackImplemenationUsingArray(5);
        stackImplemenationUsingArray.push(10);
        stackImplemenationUsingArray.push(20);
        stackImplemenationUsingArray.push(30);
        stackImplemenationUsingArray.push(40);
        stackImplemenationUsingArray.push(50);
        stackImplemenationUsingArray.push(60);
        stackImplemenationUsingArray.pop();
        System.out.println(stackImplemenationUsingArray.peek());

        //HouseRobber

        HouseRobber houseRobber = new HouseRobber();
        int[] houseNums={2,7,9,3,1};
        System.out.println("The houseRobber output : "+houseRobber.rob(houseNums));

        //LongestPalindromicSubstring

        LongestPalindrome longestPalindrome = new LongestPalindrome();
        longestPalindrome.longestPalindrome("babac");

        //BubbleSort

        BubbleSort bubbleSort = new BubbleSort();
        int[] numberArray= {5,4,3,1,2};

//        System.out.println("The Sorted Array : "+ Arrays.toString(bubbleSort.bubbleSortingImplementation(numberArray)));
//
//        //QuickSortImplementation
//
//        QuickSort quickSort = new QuickSort(numberArray);
//        System.out.println("The Quick Sort Implemented Array is " + Arrays.toString(quickSort.quickSortImplementation(numberArray,0,numberArray.length-1)));
//
        //MergeSort

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(numberArray,0,numberArray.length-1);
        System.out.println(" The Merge Sorted Array is "+Arrays.toString(numberArray));


        // Creating a graph with 5 vertices using ArrayList
        int V = 5;
        ArrayList<ArrayList<Integer>> adj
                = new ArrayList<ArrayList<Integer> >(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        GraphImplementationUsingAdjacencyList graphObj = new GraphImplementationUsingAdjacencyList();
        // Adding edges one by one
        graphObj.addEdge(adj, 0, 1);
        graphObj.addEdge(adj, 0, 4);
        graphObj.addEdge(adj, 1, 2);
        graphObj.addEdge(adj, 1, 3);
        graphObj.addEdge(adj, 1, 4);
        graphObj.addEdge(adj, 2, 3);
        graphObj.addEdge(adj, 3, 4);

        graphObj.printGraph(adj);


        //Creating a graph objevt using LinkedList

        GraphImplementationUsingLinkedList g = new GraphImplementationUsingLinkedList(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);



        BFSUsingLinkedList bfs= new BFSUsingLinkedList();
        bfs.BFS(2,g.adj);

        DFSGraph dfs= new DFSGraph();
        dfs.DFS(g.adj,2);

    }



}
