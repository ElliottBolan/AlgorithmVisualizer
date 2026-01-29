import { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import { API_BASE_URL } from '../config';

function HomePage() {
  const [categories, setCategories] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);
  const navigate = useNavigate();

  useEffect(() => {
    const fetchCategories = async () => {
      try {
        const response = await fetch(`${API_BASE_URL}/api/categories`);
        if (!response.ok) {
          throw new Error('Failed to fetch categories');
        }
        const data = await response.json();
        setCategories(data);
        setLoading(false);
      } catch (err) {
        setError(err.message);
        setLoading(false);
      }
    };
    
    fetchCategories();
  }, []);

  const handleCategoryClick = (categoryId) => {
    navigate(`/category/${categoryId}`);
  };

  if (loading) {
    return (
      <div className="container">
        <div className="loading">Loading categories...</div>
      </div>
    );
  }

  if (error) {
    return (
      <div className="container">
        <div className="error">
          <h2>Error</h2>
          <p>{error}</p>
          <p>Make sure the backend server is running on port 8080.</p>
        </div>
      </div>
    );
  }

  return (
    <div className="container">
      <h1>Algorithm Visualizer</h1>
      <div className="category-grid">
        {categories.map((category) => (
          <button
            key={category.id}
            className="category-button"
            onClick={() => handleCategoryClick(category.id)}
          >
            <h2>{category.name}</h2>
            <p>{category.description}</p>
          </button>
        ))}
      </div>
    </div>
  );
}

export default HomePage;
