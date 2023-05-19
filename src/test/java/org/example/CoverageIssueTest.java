package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


@ExtendWith(MockitoExtension.class)
class CoverageIssueTest {

  @Test
  void is_stopping() {
    CoverageIssue underTest = new CoverageIssue("ALL");
    assertStopped(underTest);
  }

  @Test
  void is_ok() {
    CoverageIssue underTest = new CoverageIssue("anything");
    assertThatNoException().isThrownBy(() -> underTest.mainCheck());
  }

  private void assertStopped(CoverageIssue underTest) {
    assertThatThrownBy(() -> underTest.mainCheck()).hasMessage("Service is currently unavailable");
  }

}
