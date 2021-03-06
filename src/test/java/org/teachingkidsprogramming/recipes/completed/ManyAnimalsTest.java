package org.teachingkidsprogramming.recipes.completed;

import org.junit.Test;
import org.teachingextensions.approvals.lite.Approvals;
import org.teachingextensions.approvals.lite.reporters.DelayedClipboardReporter;
import org.teachingextensions.approvals.lite.reporters.DiffReporter;
import org.teachingextensions.approvals.lite.reporters.UseReporter;
import org.teachingextensions.approvals.lite.util.JUnitUtils;
import org.teachingkidsprogramming.recipes.completed.section07events.ManyAnimals;

@UseReporter({DiffReporter.class, DelayedClipboardReporter.class})
public class ManyAnimalsTest
{
  @Test
  public void testShowSomeTurtles(){
    JUnitUtils.assumeNotHeadless();
    ManyAnimals m = new ManyAnimals();
    Approvals.verify(m.mt);
  }
}
