# Algorithm Visualizer

A full-stack application for visualizing and learning about various algorithms, built with Java Spring Boot backend and React + Vite frontend.

## Features

- **11 Algorithm Categories**: Search, Sort, Hash, Graph, Machine Learning, Artificial Intelligence, Dynamic Programming, Divide and Conquer, Greedy, Two Pointer, and Sliding Window
- **Multiple Algorithms**: Each category contains several algorithms with detailed information
- **Time & Space Complexity**: View computational complexity for each algorithm
- **Algorithm Previews**: Quick descriptions of how each algorithm works
- **Modern UI**: Beautiful, responsive interface with smooth animations

## Tech Stack

### Backend
- Java 17
- Spring Boot 3.2.0
- Maven

### Frontend
- React 18
- Vite
- React Router DOM

## Getting Started

### Prerequisites
- Java 17 or higher
- Node.js 18 or higher
- Maven 3.6 or higher

### Backend Setup

1. Navigate to the backend directory:
```bash
cd backend
```

2. Build the project:
```bash
mvn clean install
```

3. Run the Spring Boot application:
```bash
mvn spring-boot:run
```

The backend server will start on `http://localhost:8080`

### Frontend Setup

1. Navigate to the frontend directory:
```bash
cd frontend
```

2. Install dependencies:
```bash
npm install
```

3. Start the development server:
```bash
npm run dev
```

The frontend will start on `http://localhost:5173`

## Usage

1. Start both the backend and frontend servers
2. Open your browser and navigate to `http://localhost:5173`
3. Click on any category to view algorithms in that category
4. View algorithm details including time complexity, space complexity, and preview

## API Endpoints

- `GET /api/categories` - Get all algorithm categories
- `GET /api/categories/{category}/algorithms` - Get algorithms by category
- `GET /api/algorithms/{id}` - Get specific algorithm details

## Project Structure

```
AlgorithmVisualizer/
├── backend/
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com/algorithmvisualizer/
│   │       │       ├── AlgorithmVisualizerApplication.java
│   │       │       ├── controller/
│   │       │       │   └── AlgorithmController.java
│   │       │       ├── model/
│   │       │       │   ├── Algorithm.java
│   │       │       │   └── Category.java
│   │       │       └── service/
│   │       │           └── AlgorithmService.java
│   │       └── resources/
│   │           └── application.properties
│   └── pom.xml
└── frontend/
    ├── src/
    │   ├── pages/
    │   │   ├── HomePage.jsx
    │   │   └── CategoryPage.jsx
    │   ├── App.jsx
    │   ├── App.css
    │   └── main.jsx
    ├── package.json
    └── vite.config.js
```

## Algorithm Categories

1. **Search**: Linear Search, Binary Search, Jump Search
2. **Sort**: Bubble Sort, Quick Sort, Merge Sort, Heap Sort
3. **Hash**: Hash Table, Collision Resolution
4. **Graph**: BFS, DFS, Dijkstra's Algorithm, Bellman-Ford
5. **Machine Learning**: Linear Regression, K-Means Clustering, K-Nearest Neighbors
6. **Artificial Intelligence**: Minimax Algorithm, A* Search, Neural Networks
7. **Dynamic Programming**: Fibonacci, 0/1 Knapsack, Longest Common Subsequence
8. **Divide and Conquer**: Merge Sort, Quick Sort, Strassen Matrix Multiplication
9. **Greedy**: Activity Selection, Huffman Coding, Prim's Algorithm
10. **Two Pointer**: Two Sum, Container With Most Water, Remove Duplicates
11. **Sliding Window**: Maximum Sum Subarray, Longest Substring, Minimum Window Substring

## License

This project is open source and available under the MIT License.