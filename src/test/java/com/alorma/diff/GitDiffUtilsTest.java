package com.alorma.diff;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyString;

public class GitDiffUtilsTest {

  @Test
  public void testExtractLinesNotNull() {
    GitDiffUtils utils = new GitDiffUtils();

    GitDiff gitDiff = utils.extractLines(anyString());

    assertNotNull(gitDiff);
  }
}
