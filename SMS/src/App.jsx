import { BrowserRouter as Router, Routes, Route } from "react-router-dom"
import ServiceDetails from "./pages/ServiceDetails"
import Navbar from "./components/Navbar"
import ServicesList from "./pages/ServicesList"
import AddSubscription from "./pages/AddSubscription"

function App() {
  
  return (
    <Router>
      <Navbar />
      <Routes>
        <Route path="/" element={<ServiceDetails />} />
        <Route path="/services" element={<ServicesList />} />
        <Route path="/add-subscription" element={<AddSubscription />} />
      </Routes>
    </Router>
  )
}

export default App
