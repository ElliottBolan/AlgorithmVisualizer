import { useState, useEffect } from 'react';
import { useParams, useNavigate } from 'react-router-dom';

function CategoryPage() {
  const [algorithms, setAlgorithms] = useState([]);
  const [categoryName, setCategoryName] = useState('');
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);
  const { categoryId } = useParams();
  const navigate = useNavigate();

  useEffect(() => {
    fetchAlgorithms();
  }, [categoryId]);

  const fetchAlgorithms = async () => {
    try {
      // First fetch all categories to get the category name
      const categoriesResponse = await fetch('http://localhost:8080/api/categories');
      const categories = await categoriesResponse.json();
      const category = categories.find(c => c.id === categoryId);
      
      if (category) {
        setCategoryName(category.name);
        setAlgorithms(category.algorithms);
      } else {
        throw new Error('Category not found');
      }
      
      setLoading(false);
    } catch (err) {
      setError(err.message);
      setLoading(false);
    }
  };

  if (loading) {
    return (
      <div className="container">
        <div className="loading">Loading algorithms...</div>
      </div>
    );
  }

  if (error) {
    return (
      <div className="container">
        <div className="error">
          <h2>Error</h2>
          <p>{error}</p>
        </div>
      </div>
    );
  }

  return (
    <div className="container">
      <button className="back-button" onClick={() => navigate('/')}>
        ← Back to Categories
      </button>
      <h1>{categoryName} Algorithms</h1>
      <div className="algorithm-grid">
        {algorithms.map((algorithm) => (
          <div key={algorithm.id} className="algorithm-card">
            <h3>{algorithm.name}</h3>
            <p>{algorithm.description}</p>
            <div className="preview-box">
              <strong>Preview:</strong> {algorithm.preview}
            </div>
            <div className="complexity-info">
              <div className="complexity-badge">
                <span className="complexity-label">Time:</span>
                <span className="complexity-value">{algorithm.timeComplexity}</span>
              </div>
              <div className="complexity-badge">
                <span className="complexity-label">Space:</span>
                <span className="complexity-value">{algorithm.spaceComplexity}</span>
              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
}

export default CategoryPage;
