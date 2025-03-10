import logo from './logo.svg';
import ReactDOM from 'react-dom/client'
import {BrowserRouter, Route, Routes} from 'react-router-dom';
import './App.css';
import Register from './Register';
import View from './View';
import Edit from './Edit';

function App() {
  return (
      <BrowserRouter>
      <Routes>
        <Route path="reg" element={<Register />} />
        <Route path="view" element={<View />} />
        <Route path="edit" element={<Edit />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;