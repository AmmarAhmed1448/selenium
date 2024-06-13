import React from "react";
import Footer from "../components/Footer";

function ServiceDetails() {
  return (
    <>
      <div className=" mx-auto p-6 md:py-6 lg:px-32  rounded-xl">
        {/* Edit Details Button */}
        <div className="flex flex-col md:flex-row justify-between md:items-center mb-4 gap-5">
          <h1 className="text-4xl font-extrabold text-blue-700">
            Awesome Streaming Services
          </h1>
          <button className="px-4 py-2 bg-blue-600 text-white w-3/5 md:w-auto font-bold rounded-lg shadow hover:bg-blue-500">
            Edit Details
          </button>
        </div>

        <div className="lg:flex lg:space-x-6 ">
          {/* Main Subscription Details */}
          <div className="flex-1 bg-gray-100 rounded-lg shadow-md p-6 mb-6 lg:mb-0">
            <h3 className="text-2xl text-blue-500 mb-4">TechCorp Ltd.</h3>
            <div className="md:border-t md:border-gray-300 md:pt-4 md:mt-4">
              <p className="text-lg mb-2">
                <strong>Purchase Date:</strong> 2023-09-01
              </p>
              <p className="text-lg mb-2">
                <strong>Cycle:</strong> 12 months
              </p>
              <p className="text-lg">
                <strong>Notification Starting Time Before Expiry:</strong> 20
                days
              </p>
            </div>
          </div>

          {/* Right Sidebar */}
          <div className="w-full lg:w-1/3 flex flex-col justify-between">
            {/* Days Left to Expire */}
            <div className="mb-6 p-6 bg-red-100 rounded-lg shadow-md text-center">
              <span className="text-6xl font-extrabold text-red-600">10</span>
              <p className="text-lg mt-2 text-red-700">
                days left to expire on
              </p>
              <p className="text-lg mt-2 font-bold text-red-700">2024-07-01</p>
            </div>

            {/* Contacts */}
            <div className="p-6 bg-gray-100 rounded-lg shadow-md">
              <h4 className="text-xl font-bold mb-4 text-blue-700">Contacts</h4>
              <div className="mb-4">
                <p className="font-medium">Ammar Ahmed Khan</p>
                <p className="text-blue-500">ammarahmedkhan@gmail.com</p>
                <p>0330-0000000</p>
              </div>
              <div className="mb-4">
                <p className="font-medium">Ammar Ahmed Khan</p>
                <p className="text-blue-500">ammarahmedkhan@gmail.com</p>
                <p>0330-0000000</p>
              </div>
              <div>
                <p className="font-medium">Ammar Ahmed Khan</p>
                <p className="text-blue-500">ammarahmedkhan@gmail.com</p>
                <p>0330-0000000</p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <Footer />
    </>
  );
}

export default ServiceDetails;
