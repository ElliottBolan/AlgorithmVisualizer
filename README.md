# Algorithm Visualizer

A full-stack application for visualizing and learning about various algorithms, built with Java Spring Boot backend and React + Vite frontend.

## Features

- **11 Algorithm Categories**: Search, Sort, Hash, Graph, Machine Learning, Artificial Intelligence, Dynamic Programming, Divide and Conquer, Greedy, Two Pointer, and Sliding Window
- **50+ Algorithms**: Each category contains multiple algorithms with detailed information
- **Time & Space Complexity**: View computational complexity for each algorithm
- **Algorithm Previews**: Quick descriptions of how each algorithm works
- **Modern UI**: Beautiful, responsive interface with smooth animations and gradient design
- **RESTful API**: Clean, well-structured backend API

## Screenshots

### Homepage
![Homepage](https://github.com/user-attachments/assets/f2865e65-8c9b-437c-ab0a-9bc4090b8793)

### Category Page (Search Algorithms)
![Category Page](https://github.com/user-attachments/assets/d81d4335-f490-4dd1-b4d1-58026376581a)

## Tech Stack

### Backend
- Java 17
- Spring Boot 3.2.0
- Maven

### Frontend
- React 18
- Vite
- React Router DOM
- Modern CSS with gradient backgrounds

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

3. (Optional) Create a `.env` file for custom configuration:
```bash
cp .env.example .env
```

4. Start the development server:
```bash
npm run dev
```

The frontend will start on `http://localhost:5173`

## Usage

1. Start both the backend and frontend servers
2. Open your browser and navigate to `http://localhost:5173`
3. Click on any category button to view algorithms in that category
4. View algorithm details including:
   - Algorithm name and description
   - Preview of how the algorithm works
   - Time complexity (Big O notation)
   - Space complexity (Big O notation)
5. Use the "Back to Categories" button to return to the homepage

## API Endpoints

- `GET /api/categories` - Get all algorithm categories with their algorithms
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
    │   ├── config.js
    │   └── main.jsx
    ├── .env.example
    ├── package.json
    └── vite.config.js
```

## Algorithm Categories

### 1. Search (3 algorithms)
- Linear Search - O(n)
- Binary Search - O(log n)
- Jump Search - O(√n)

### 2. Sort (4 algorithms)
- Bubble Sort - O(n²)
- Quick Sort - O(n log n)
- Merge Sort - O(n log n)
- Heap Sort - O(n log n)

### 3. Hash (2 algorithms)
- Hash Table - O(1) avg
- Collision Resolution - O(1) avg

### 4. Graph (4 algorithms)
- Breadth-First Search (BFS) - O(V + E)
- Depth-First Search (DFS) - O(V + E)
- Dijkstra's Algorithm - O(V²) or O(E log V)
- Bellman-Ford - O(VE)

### 5. Machine Learning (3 algorithms)
- Linear Regression - O(n)
- K-Means Clustering - O(nki)
- K-Nearest Neighbors - O(n)

### 6. Artificial Intelligence (3 algorithms)
- Minimax Algorithm - O(b^d)
- A* Search - O(b^d)
- Neural Network - Varies

### 7. Dynamic Programming (3 algorithms)
- Fibonacci DP - O(n)
- 0/1 Knapsack - O(nW)
- Longest Common Subsequence - O(mn)

### 8. Divide and Conquer (3 algorithms)
- Merge Sort - O(n log n)
- Quick Sort - O(n log n)
- Strassen Matrix Multiplication - O(n^2.807)

### 9. Greedy (3 algorithms)
- Activity Selection - O(n log n)
- Huffman Coding - O(n log n)
- Prim's Algorithm - O(E log V)

### 10. Two Pointer (3 algorithms)
- Two Sum - O(n)
- Container With Most Water - O(n)
- Remove Duplicates - O(n)

### 11. Sliding Window (3 algorithms)
- Maximum Sum Subarray - O(n)
- Longest Substring - O(n)
- Minimum Window Substring - O(n)

## Configuration

### Frontend Configuration

You can configure the backend API URL by creating a `.env` file in the frontend directory:

```env
VITE_API_BASE_URL=http://localhost:8080
```

For production, update this to your deployed backend URL.

### Backend Configuration

The backend CORS configuration is set in `AlgorithmController.java`. For production, update the allowed origins to match your frontend deployment URL.

## Development

### Adding New Algorithms

To add new algorithms:

1. Open `backend/src/main/java/com/algorithmvisualizer/service/AlgorithmService.java`
2. Add new `Algorithm` objects to the `initializeAlgorithms()` method
3. The frontend will automatically display the new algorithms

### Styling

The application uses a modern gradient design with:
- Purple-to-purple gradient background
- White cards with shadow effects
- Hover animations for interactive elements
- Responsive grid layout

## Security

- CORS is configured with specific allowed origins
- No authentication required (suitable for educational purposes)
- CodeQL security scanning passed with 0 vulnerabilities

## License

This project is open source and available under the MIT License.

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.