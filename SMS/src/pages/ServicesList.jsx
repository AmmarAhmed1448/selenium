import Table from "../components/Table";

function ServicesList() {
  const subsData = [
    {
      service_name: "Premium Cloud Storage",
      company_name: "Cloud Solutions Inc.",
      purchase_date: "2023-01-15",
      subscription_duration: "Yearly",
      days_left_to_expire: 230,
      subscription_price: 120.0,
    },
    {
      service_name: "Professional Email Hosting",
      company_name: "WebServe Ltd.",
      purchase_date: "2023-11-10",
      subscription_duration: "Monthly",
      days_left_to_expire: 5,
      subscription_price: 10.0,
    },
    {
      service_name: "Enterprise CRM",
      company_name: "SalesForce Partners",
      purchase_date: "2022-06-01",
      subscription_duration: "Quarterly",
      days_left_to_expire: 60,
      subscription_price: 300.0,
    },
    {
      service_name: "Advanced Security Suite",
      company_name: "SecureTech Corp.",
      purchase_date: "2023-05-20",
      subscription_duration: "Yearly",
      days_left_to_expire: 120,
      subscription_price: 150.0,
    },
    {
      service_name: "Marketing Automation Pro",
      company_name: "AdOpt Solutions",
      purchase_date: "2023-08-01",
      subscription_duration: "Monthly",
      days_left_to_expire: 10,
      subscription_price: 50.0,
    },
  ];

  const subsHeaders = [
    { label: "Service Name", field: "service_name" },
    { label: "Company Name", field: "company_name" },
    { label: "Purchase Date", field: "purchase_date" },
    { label: "Subscription Duration", field: "subscription_duration" },
    { label: "Days Left to Expire", field: "days_left_to_expire" },
    { label: "Subscription Price", field: "subscription_price" },
  ];

  return (
    <>
      <div className="mx-32">
        <h1 className="text-3xl md:text-5xl font-semibold my-6">Subscription List</h1>
        <div className="flex justify-end">
        <button type="button" class="text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:bg-blue-600 dark:hover:bg-blue-700 focus:outline-none dark:focus:ring-blue-800">Add new subscription</button>
        </div>
        <div className="my-6">
        <Table headers={subsHeaders} data={subsData} />
        </div>
      </div>
    </>
  );
}

export default ServicesList;
