package com.algorithmvisualizer.service;

import com.algorithmvisualizer.model.Algorithm;
import com.algorithmvisualizer.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlgorithmService {
    
    private final List<Algorithm> algorithms;

    public AlgorithmService() {
        this.algorithms = initializeAlgorithms();
    }

    public List<Category> getAllCategories() {
        List<String> categoryNames = Arrays.asList(
            "Search", "Sort", "Hash", "Graph", 
            "Machine Learning", "Artificial Intelligence", 
            "Dynamic Programming", "Divide and Conquer", 
            "Greedy", "Two Pointer", "Sliding Window"
        );

        return categoryNames.stream()
            .map(name -> new Category(
                name.toLowerCase().replaceAll(" ", "-"),
                name,
                "Explore " + name + " algorithms",
                getAlgorithmsByCategory(name)
            ))
            .collect(Collectors.toList());
    }

    public List<Algorithm> getAlgorithmsByCategory(String category) {
        return algorithms.stream()
            .filter(a -> a.getCategory().equals(category))
            .collect(Collectors.toList());
    }

    public Algorithm getAlgorithmById(String id) {
        return algorithms.stream()
            .filter(a -> a.getId().equals(id))
            .findFirst()
            .orElse(null);
    }

    private List<Algorithm> initializeAlgorithms() {
        List<Algorithm> list = new ArrayList<>();

        // Search Algorithms
        list.add(new Algorithm("linear-search", "Linear Search", "Search", 
            "Sequential search through an array", "O(n)", "O(1)", 
            "Iterates through each element until target is found"));
        list.add(new Algorithm("binary-search", "Binary Search", "Search", 
            "Divide and conquer search on sorted array", "O(log n)", "O(1)", 
            "Repeatedly divides search space in half"));
        list.add(new Algorithm("jump-search", "Jump Search", "Search", 
            "Jump ahead by fixed steps then linear search", "O(√n)", "O(1)", 
            "Combines jumping and linear search"));

        // Sort Algorithms
        list.add(new Algorithm("bubble-sort", "Bubble Sort", "Sort", 
            "Repeatedly swap adjacent elements if in wrong order", "O(n²)", "O(1)", 
            "Simple comparison-based sorting"));
        list.add(new Algorithm("quick-sort", "Quick Sort", "Sort", 
            "Divide and conquer with pivot element", "O(n log n)", "O(log n)", 
            "Efficient in-place sorting algorithm"));
        list.add(new Algorithm("merge-sort", "Merge Sort", "Sort", 
            "Divide array and merge sorted halves", "O(n log n)", "O(n)", 
            "Stable divide and conquer sorting"));
        list.add(new Algorithm("heap-sort", "Heap Sort", "Sort", 
            "Build max heap and extract elements", "O(n log n)", "O(1)", 
            "Uses binary heap data structure"));

        // Hash Algorithms
        list.add(new Algorithm("hash-table", "Hash Table", "Hash", 
            "Key-value store with hash function", "O(1) avg", "O(n)", 
            "Fast lookup using hashing"));
        list.add(new Algorithm("collision-resolution", "Collision Resolution", "Hash", 
            "Handle hash collisions via chaining or probing", "O(1) avg", "O(n)", 
            "Manages hash conflicts"));

        // Graph Algorithms
        list.add(new Algorithm("bfs", "Breadth-First Search", "Graph", 
            "Level-order traversal using queue", "O(V + E)", "O(V)", 
            "Explores neighbors before going deeper"));
        list.add(new Algorithm("dfs", "Depth-First Search", "Graph", 
            "Explores as far as possible before backtracking", "O(V + E)", "O(V)", 
            "Uses stack/recursion for traversal"));
        list.add(new Algorithm("dijkstra", "Dijkstra's Algorithm", "Graph", 
            "Shortest path from source to all vertices", "O(V²) or O(E log V)", "O(V)", 
            "Greedy shortest path algorithm"));
        list.add(new Algorithm("bellman-ford", "Bellman-Ford", "Graph", 
            "Shortest path with negative weights", "O(VE)", "O(V)", 
            "Handles negative edge weights"));

        // Machine Learning
        list.add(new Algorithm("linear-regression", "Linear Regression", "Machine Learning", 
            "Predict continuous values using linear model", "O(n)", "O(1)", 
            "Fits line to minimize squared errors"));
        list.add(new Algorithm("k-means", "K-Means Clustering", "Machine Learning", 
            "Group data into K clusters", "O(nki)", "O(nk)", 
            "Iteratively assigns points to centroids"));
        list.add(new Algorithm("knn", "K-Nearest Neighbors", "Machine Learning", 
            "Classify based on K nearest data points", "O(n)", "O(n)", 
            "Distance-based classification"));

        // Artificial Intelligence
        list.add(new Algorithm("minimax", "Minimax Algorithm", "Artificial Intelligence", 
            "Decision making in zero-sum games", "O(b^d)", "O(bd)", 
            "Alternates between maximizing and minimizing"));
        list.add(new Algorithm("a-star", "A* Search", "Artificial Intelligence", 
            "Informed search using heuristics", "O(b^d)", "O(b^d)", 
            "Best-first search with heuristic"));
        list.add(new Algorithm("neural-network", "Neural Network", "Artificial Intelligence", 
            "Multi-layer perceptron for learning", "Varies", "O(weights)", 
            "Layers of interconnected neurons"));

        // Dynamic Programming
        list.add(new Algorithm("fibonacci", "Fibonacci DP", "Dynamic Programming", 
            "Calculate Fibonacci numbers efficiently", "O(n)", "O(n)", 
            "Store previous results to avoid recomputation"));
        list.add(new Algorithm("knapsack", "0/1 Knapsack", "Dynamic Programming", 
            "Maximize value with weight constraint", "O(nW)", "O(nW)", 
            "Build solution table bottom-up"));
        list.add(new Algorithm("lcs", "Longest Common Subsequence", "Dynamic Programming", 
            "Find longest common subsequence", "O(mn)", "O(mn)", 
            "Compare sequences using DP table"));

        // Divide and Conquer
        list.add(new Algorithm("merge-sort-dc", "Merge Sort", "Divide and Conquer", 
            "Divide array and merge sorted halves", "O(n log n)", "O(n)", 
            "Classic divide and conquer"));
        list.add(new Algorithm("quick-sort-dc", "Quick Sort", "Divide and Conquer", 
            "Partition around pivot recursively", "O(n log n)", "O(log n)", 
            "In-place divide and conquer"));
        list.add(new Algorithm("strassen", "Strassen Matrix Multiplication", "Divide and Conquer", 
            "Fast matrix multiplication", "O(n^2.807)", "O(n²)", 
            "Reduces multiplication operations"));

        // Greedy Algorithms
        list.add(new Algorithm("activity-selection", "Activity Selection", "Greedy", 
            "Select maximum non-overlapping activities", "O(n log n)", "O(1)", 
            "Choose earliest finishing activity"));
        list.add(new Algorithm("huffman", "Huffman Coding", "Greedy", 
            "Optimal prefix-free encoding", "O(n log n)", "O(n)", 
            "Builds optimal encoding tree"));
        list.add(new Algorithm("prims", "Prim's Algorithm", "Greedy", 
            "Minimum spanning tree", "O(E log V)", "O(V)", 
            "Grows MST from starting vertex"));

        // Two Pointer
        list.add(new Algorithm("two-sum", "Two Sum", "Two Pointer", 
            "Find pair that sums to target", "O(n)", "O(1)", 
            "Use two pointers from ends"));
        list.add(new Algorithm("container-water", "Container With Most Water", "Two Pointer", 
            "Find maximum water container", "O(n)", "O(1)", 
            "Move pointers based on height"));
        list.add(new Algorithm("remove-duplicates", "Remove Duplicates", "Two Pointer", 
            "Remove duplicates from sorted array", "O(n)", "O(1)", 
            "In-place duplicate removal"));

        // Sliding Window
        list.add(new Algorithm("max-sum-subarray", "Maximum Sum Subarray", "Sliding Window", 
            "Find max sum of k consecutive elements", "O(n)", "O(1)", 
            "Maintain window sum"));
        list.add(new Algorithm("longest-substring", "Longest Substring", "Sliding Window", 
            "Longest substring without repeating chars", "O(n)", "O(k)", 
            "Expand and contract window"));
        list.add(new Algorithm("min-window", "Minimum Window Substring", "Sliding Window", 
            "Smallest window containing all characters", "O(n)", "O(k)", 
            "Dynamic window size"));

        return list;
    }
}
