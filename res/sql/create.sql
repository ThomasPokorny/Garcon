#
# first draft of the CREATE scripts for the garcon db application 
# @author Thomas Robert Pokorny
# @data 5 Jan 2020 
#

CREATE SCHEMA garcon;

# represents a table
CREATE TABLE garcon.table(
    id SERIAL PRIMARY KEY,
    num INT UNIQUE NOT NULL
);

# represents a menue category, for instance "main dishes", or "sea food"
CREATE TABLE garcon.category(
    id SERIAL PRIMARY KEY,
    name TEXT UNIQUE NOT NULL
);

# represents a dish, dishes can have more categories 
CREATE TABLE garcon.dish(
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    description TEXT,
    allergenes TEXT,
    price decimal NOT NULL,
    discount decimal NOT NULL,
    categories integer ARRAY
);


