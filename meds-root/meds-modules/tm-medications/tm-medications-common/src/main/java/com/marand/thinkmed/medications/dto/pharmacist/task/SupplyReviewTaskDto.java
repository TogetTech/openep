package com.marand.thinkmed.medications.dto.pharmacist.task;

import com.marand.thinkmed.medications.TaskTypeEnum;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Klavdij Lapajne
 */

public class SupplyReviewTaskDto extends SupplyReminderTaskDto
{
  private boolean alreadyDispensed;

  public SupplyReviewTaskDto()
  {
    setTaskType(TaskTypeEnum.SUPPLY_REVIEW);
  }

  public boolean isAlreadyDispensed()
  {
    return alreadyDispensed;
  }

  public void setAlreadyDispensed(final boolean alreadyDispensed)
  {
    this.alreadyDispensed = alreadyDispensed;
  }

  @Override
  protected void appendToString(final ToStringBuilder tsb)
  {
    super.appendToString(tsb);
    tsb
        .append("alreadyDispensed", alreadyDispensed);
  }
}
