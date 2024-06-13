import React, { useState } from "react";

function AddServiceForm() {
  // Initial form state
  const [formData, setFormData] = useState({
    serviceName: "",
    companyName: "",
    initialDate: "",
    duration: "",
    expiryDate: "",
    renewalDates: "",
    price: "",
    notificationTime: "",
  });

  // State to manage contacts
  const [contacts, setContacts] = useState([{ email: "", phone: "" }]);

  // Handle form input changes
  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  };

  // Handle contact input changes
  const handleContactChange = (index, e) => {
    const { name, value } = e.target;
    const newContacts = [...contacts];
    newContacts[index][name] = value;
    setContacts(newContacts);
  };

  // Add a new contact
  const addContact = () => {
    setContacts([...contacts, { email: "", phone: "" }]);
  };

  // Remove a contact
  const removeContact = (index) => {
    const newContacts = contacts.filter((_, i) => i !== index);
    setContacts(newContacts);
  };

  // Calculate expiry date based on initial date and duration
  const calculateExpiryDate = (initialDate, duration) => {
    const date = new Date(initialDate);
    switch (duration) {
      case "Monthly":
        date.setMonth(date.getMonth() + 1);
        break;
      case "Quarterly":
        date.setMonth(date.getMonth() + 3);
        break;
      case "Yearly":
        date.setFullYear(date.getFullYear() + 1);
        break;
      default:
        break;
    }
    return date.toISOString().split("T")[0]; // Format as YYYY-MM-DD
  };

  // Handle form submission
  const handleSubmit = (e) => {
    e.preventDefault();
    const calculatedExpiryDate = calculateExpiryDate(formData.initialDate, formData.duration);
    console.log({ ...formData, expiryDate: calculatedExpiryDate, contacts });
    // Add form submission logic here (e.g., send data to API)
  };

  return (
    <div className="max-w-3xl mx-auto p-8 bg-white rounded-lg shadow-md">
      <h2 className="text-3xl font-bold mb-6 text-center text-blue-700">Add New Service</h2>
      <form onSubmit={handleSubmit} className="space-y-6">
        {/* Service Name */}
        
        <div class="mb-5">
    
    
  
          <label htmlFor="serviceName" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">
            Service Name
          </label>
          <input
            type="text"
            name="serviceName"
            id="serviceName"
            value={formData.serviceName}
            onChange={handleInputChange}
            required
            className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
            placeholder="Enter service name"
          />
        </div>

        {/* Company Name */}
        <div>
          <label htmlFor="companyName" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">
            Company Name
          </label>
          <input
            type="text"
            name="companyName"
            id="companyName"
            value={formData.companyName}
            onChange={handleInputChange}
            required
            className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
            placeholder="Enter company name"
          />
        </div>

        {/* Contacts */}
        <div>
          <label className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Contacts</label>
          {contacts.map((contact, index) => (
            <div key={index} className="flex space-x-4 items-center mb-2">
              <input
                type="email"
                name="email"
                value={contact.email}
                onChange={(e) => handleContactChange(index, e)}
                required
                className="flex-1 bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                placeholder="Enter email"
              />
              <input
                type="tel"
                name="phone"
                value={contact.phone}
                onChange={(e) => handleContactChange(index, e)}
                required
                className="flex-1 bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                placeholder="Enter phone number"
              />
              {contacts.length > 1 && (
                <button
                  type="button"
                  onClick={() => removeContact(index)}
                  className="px-4 py-2 bg-red-600 text-white font-semibold rounded-lg shadow-md hover:bg-red-500 focus:outline-none"
                >
                  Remove
                </button>
              )}
            </div>
          ))}
          <button
            type="button"
            onClick={addContact}
            className="py-2.5 px-5 me-2 mb-2 text-sm font-medium text-gray-900 focus:outline-none bg-white rounded-lg border border-gray-200 hover:bg-gray-100 hover:text-blue-700 focus:z-10 focus:ring-4 focus:ring-gray-100 dark:focus:ring-gray-700 dark:bg-gray-800 dark:text-gray-400 dark:border-gray-600 dark:hover:text-white dark:hover:bg-gray-700"
          >
            Add More
          </button>
        </div>

        {/* Initial Subscription Date */}
        <div>
          <label htmlFor="initialDate" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">
            Initial Subscription Date
          </label>
          <input
            type="date"
            name="initialDate"
            id="initialDate"
            value={formData.initialDate}
            onChange={handleInputChange}
            required
            className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
          />
        </div>

        {/* Subscription Duration */}
        <div>
          <label htmlFor="duration" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">
            Subscription Duration
          </label>
          <select
            name="duration"
            id="duration"
            value={formData.duration}
            onChange={handleInputChange}
            required
            className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
          >
            <option value="">Select duration</option>
            <option value="Monthly">Monthly</option>
            <option value="Quarterly">Quarterly</option>
            <option value="Yearly">Yearly</option>
          </select>
        </div>

        {/* Subscription Price */}
        <div>
          <label htmlFor="price" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">
            Subscription Price (in USD)
          </label>
          <input
            type="number"
            name="price"
            id="price"
            value={formData.price}
            onChange={handleInputChange}
            required
            className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
            placeholder="Enter subscription price"
          />
        </div>

        {/* Notification Time */}
        <div>
          <label htmlFor="notificationTime" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">
            Notification Starting Time Before Expiration (in days)
          </label>
          <input
            type="number"
            name="notificationTime"
            id="notificationTime"
            value={formData.notificationTime}
            onChange={handleInputChange}
            required
            className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
            placeholder="Enter notification time"
          />
        </div>

        {/* Submit Button */}
        <div className="text-right">
          <button
            type="submit"
            className="px-6 py-2 bg-blue-600 text-white font-semibold rounded-lg shadow-md hover:bg-blue-500 focus:outline-none focus:ring-2 focus:ring-blue-500 focus:ring-offset-2"
          >
            Add Service
          </button>
        </div>
      </form>
    </div>
  );
}

export default AddServiceForm;
