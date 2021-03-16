# Iconic Product API
Tags: product, api
Created by zainglenn on 2021/03/16
     
## Validate Response meets filtered criteria provided (male)
Tags: gender

Given I request products with a certain critea
When I view response
Then I should only see results with the specified criteria in request url

* Run products request filtered by query
    |key            | value    |
    |---------------|----------|
    |gender         |male      |
    |search query   |boots     |
    |page           |1         |
    |page size      |10        |
    |sort           |popularity|
* Validate response only has gender "male" in response
* Validate response only relates to search query provided "boots"
* Vallidate no free items are list in response
* Validate response is sorted by "popularity"
* Validate page size matches matches product response size of "10"

## Validate Response meets filtered criteria provided (female)
Tags: gender

Given I request products with a certain critea
When I view response
Then I should only see results with the specified criteria in request url

* Run products request filtered by query
    |key            | value    |
    |---------------|----------|
    |gender         |female    |
    |search query   |dress     |
    |page           |1         |
    |page size      |100       |
    |sort           |price     |
* Validate response only has gender "female" in response
* Validate response only relates to search query provided "dress"
* Vallidate no free items are list in response
* Validate response is sorted by "price"
* Validate page size matches matches product response size of "100"

## Validate only products matching search critera are returned
Tags: search

Given I specify a search criteria
When I view results
Then I should only see results match criteria

* Create and validate response has specified search criteria "shoes"
* Create and validate response has specified search criteria "dress"
* Create and validate response has specified search criteria "formal"
* Create and validate response has specified search criteria "jeans"
* Create and validate response has specified search criteria "jacket"
* Create and validate response has specified search criteria "pants"
* Create and validate response has specified search criteria "tshirts"