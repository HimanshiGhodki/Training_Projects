<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
    <html>
    <body>
        <h2>My cd collection</h2>
        <table border="1" bgcolor="skyblue" width="90%" align="center">
            <tr bgcolor="9acd32">
                <th align="left">title</th>
                <th align="left">artist</th>
                <th align="left">country</th>
                <th align="left">company</th>
                <th align="left">price</th>
                <th align="left">year</th>
            </tr>
            <xsl:for-each select="catalog/cd">
                <tr bgcolor="9acd32">
                    <td><xsl:value-of select="title"/></td>
                    <td><xsl:value-of select="artist"/></td>
                    <td><xsl:value-of select="country"/></td>
                    <td><xsl:value-of select="company"/></td>
                    <td><xsl:value-of select="price"/></td>
                    <td><xsl:value-of select="year"/></td>
                </tr>
            </xsl:for-each>
        </table>
    </body>
    </html>



