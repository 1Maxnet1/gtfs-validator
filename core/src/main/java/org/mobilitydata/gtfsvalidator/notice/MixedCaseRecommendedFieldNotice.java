package org.mobilitydata.gtfsvalidator.notice;

/**
 * A string field has a value that does not contain mixed case.
 *
 * <p>Severity: {@code SeverityLevel.WARNING}
 *
 * @see org.mobilitydata.gtfsvalidator.annotation.MixedCase
 */
public class MixedCaseRecommendedFieldNotice extends ValidationNotice {
  private final String filename;

  private final String fieldName;

  private final String fieldValue;
  private final int csvRowNumber;

  public MixedCaseRecommendedFieldNotice(
      String filename, String fieldName, String fieldValue, int csvRowNumber) {
    super(SeverityLevel.WARNING);
    this.filename = filename;
    this.fieldName = fieldName;
    this.fieldValue = fieldValue;
    this.csvRowNumber = csvRowNumber;
  }
}
