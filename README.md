CSV Product Reader and Translator
===================================

A simple project to practice Maven dependency management for an Alura course. This Java application reads a CSV data file, processes the information by translating it from English to Portuguese, and displays the final result in the terminal.

Technologies and Libraries
----------------------------

*   **Java 25**

*   **Maven**: Dependency management and build tool.

*   **OpenCSV (5.12.0)**: Used for parsing and mapping the products.csv file directly to Java objects.
*   **LibreTranslate**: API integration to translate the product data.


How it works
-----------------

1.  **Reading**: The system locates and reads the products.csv file from the resources folder.

2.  **Mapping**: Uses @CsvBindByName annotations to seamlessly convert CSV rows into the Produto model.

3.  **Translation**: Through the TraduzProdutoService, the name, category, and description fields are sent to the LibreTranslate API.

4.  **Output**: Both the original and translated data are printed to the console.


Project Structure
-----------------------

The project follows a simplified MVC architecture pattern:

*   model: Data representation

*   service: Business logic (Translation API integration).

*   resources: Configuration files and data (CSV).
