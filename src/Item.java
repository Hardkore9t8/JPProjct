import java.util.Date;

/**A constant called manufacturer that would be set to “OracleProduction”.
  A method setProductionNumber that would have one integer parameter
  A method setName that would have one String parameter
  A method getName that would return a String
  A method getManufactureDate that would return a Date
  A method getSerialNumber that would return an int
 *
 */
public interface Item {

 final String manufacturerOrigin = "OracleProduction";

  /**This mutator sets the production number of the Item
   * @param productionNo
   */
 void setProductionNumber(int productionNo);

  /**This mutator sets the name of the Item
   * @param name
   */
 void setName(String name);

  /**This accessor gets the name of the Item*/
   String getName();

    /**This accessor gets the date of the Item*/
   Date getManufactureDate();

    /**This accessor gets the serial number of the Item*/
   int getSerialNumber();

//
    //
}
