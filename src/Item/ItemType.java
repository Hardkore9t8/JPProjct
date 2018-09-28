/**Naldo Ash
 *
 */
package Item;
public enum ItemType {

    AUDIO_MOBILE("AM"),
    AUDIO("AU"),
    VISUAL("VI"),
    VISUAL_MOBILE("VM");

  private final String code;

  /**
   *This constructor for Item type takes a string argument.
   * @param code should be one of the above code types
   */
   ItemType(String code ) {
    this.code = code;
  }
  //This accessor returns the Item code
  public String getCode() {
    return code;
  }
}
