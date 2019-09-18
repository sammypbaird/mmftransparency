# MMF Transparency

## Project Description and Use Cases
The overall goal of this project is to treat a Money Market Fund (MMF) like any other portfolio on our system, where users can see the individual holdings that make up a fund and not merely its top-level statistics. Right now, a user can only see average credit ratings, average rate of return, etc., for the MMF as a whole and not the individual securities inside it, even though theoretically you own a proportion of all the underlying securities. The same holds true for mutual funds, hedge funds, exchange-traded funds and the like.

This lack of transparency has the potential to distort your risk analytics and compliance rules. Perhaps you want to look at your exposure to Australia. Your portfolio might show you have a bond from Australia and an MMF from the U.S., but the MMF may have some holdings in Australia too, which won't show up in the graphs or tables on our risk page for exposure by country. Likewise, if you have a compliance rule for your portfolio that no more than 5 percent of its holdings be in Australian bonds or companies, a failure for that rule should be triggered when the Australian bonds you hold plus the portion of Australian bonds and stocks held in your MMFs is greater than 5 percent, but currently we only take into account the individual bonds and stocks we know about, not the ones inside MMFs.

The user stories would look a little like these:

1) A user sees a line item in a data table for an MMF and clicks on it. The line item expands into more line items, one for each component of the fund.

2) Suppose a user has $1,000,000 in an MMF from AllianceBernstein. The fund has 3.68% of its holdings in Rabobank Nederland. The user also has $500,000 in an MMF from Oppenheimer, which has a combined 2.94% of its holdings in Rabobank Nederland. In an MMF-expanded position level report, the user would be able to see in a single line item that he or she holds $51,550 in Rabobank Nederland.

3) The same user in use case two would be able to click on an exposure report by region. This would display a chart and a table of data with holdings grouped by country. The user has a $250,000 bond from the Netherlands. The pie chart wedge (or other chart segment) and the line item in the table for the Netherlands would include not only the $250,000 bond, but the $51,550 held in his or her MMFs for Rabobank.

4) Same as use case three, but for asset classes instead of regions.

For an intern project, Justin Reed suggested our focus should be on use case 3 in terms of our output, although to make it simpler for our interns, we might not incorporate the $250,000 bond scenario in with the rest of it. We might just want to focus on the two MMFs and have that be our scenario. Basically, he'd like to see us have a chart and a data table by region with the individual holdings summed up across MMFs.