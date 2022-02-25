# inheritance_4
Write a program to read the data from N contributors (N provided by the user), which
can be an individual or a legal entity, and then show the amount of tax paid by each,
as well as the total tax collected.
Individual data are: name, annual income and health expenses. Legal person data
are name, annual income and number of employees. The rules for tax calculation are the
following:
Individuals: people whose income was below 20000.00 pay 15% tax. people with
income from 20000.00 onwards pay 25% tax. If the person had health expenses, 50%
of these expenses are deducted from the tax.
Example: a person whose income was 50000.00 and had 2000.00 in health expenses, the tax
becomes: (50000 * 25%) - (2000 * 50%) = 11500.00
Legal entity: legal entities pay 16% tax. However, if the company has more than 10
employees, she pays 14% tax.
Example: a company whose income was 400000.00 and has 25 employees, the tax is:
400000 * 14% = 56000.00
