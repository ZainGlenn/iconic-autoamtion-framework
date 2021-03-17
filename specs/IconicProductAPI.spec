# Iconic Product API
Tags: product, api
Created by zainglenn on 2021/03/16
     
## Validate Response meets filtered criteria provided (male)
Tags: gender

Given I request products with a certain critea
When I view response
Then I should only see results with the specified criteria in request url

* Run products request filtered by query
    |key       | value    |
    |----------|----------|
    |gender    |male      |
    |q         |boots     |
    |page      |1         |
    |page_size |10        |
    |sort      |popularity|
* Validate response does not have gender "female" in response
* Validate response relates to search query provided "boots"
* Validate response does not relate to search query
    |key     |
    |--------|
    |dress   |
    |jeans   |
    |jacket  |
    |pants   |
    |t-shirts|
* Validate no free items are list in response
* Validate page size matches matches product response size of "10"

## Validate Response meets filtered criteria provided (female)
Tags: gender

Given I request products with a certain critea
When I view response
Then I should only see results with the specified criteria in request url

* Run products request filtered by query
    |key       | value    |
    |----------|----------|
    |gender    |female    |
    |q         |dress     |
    |page      |1         |
    |page size |30        |
    |sort      |popularity|
* Validate response does not have gender "male" in response
* Validate response relates to search query provided "dress"
* Validate response does not relate to search query
    |key    |
    |-------|
    |shoes  |
    |boots  |
    |jeans  |
    |jacket |
    |pants  |
    |tshirts|
* Validate no free items are list in response
* Validate page size matches matches product response size of "30"

## Validate only products matching search critera are returned
Tags: search_criteria

Given I specify a search criteria
When I view results
Then I should only see results match criteria

* Run products request filtered by query
    |key       | value    |
    |----------|----------|
    |gender    |female    |
    |q         |boots     |
    |page      |1         |
    |page_size |10        |
    |sort      |popularity|
* Create and validate response has specified search criteria
    |Search  |
    |--------|
    |boots   |
    |shoes   |
    |dress   |
    |jeans   |
    |jacket  |
    |pants   |
    |t-shirts|