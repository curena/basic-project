package org.cecil.basic.j14;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwitchExpressions {

  public enum Scientist {
    EINSTEIN, CURIE, CRICK, RUTHERFORD, WATSON, GOODALL, SAGAN, SACKS
  }

  public String whatKindOfScientist_Before(Scientist scientist) {
    String whatKind;

    switch (scientist) {
      case EINSTEIN:
      case CURIE:
      case RUTHERFORD:
        whatKind = "physicist";
      break;
      case WATSON:
      case CRICK:
        whatKind = "molecular biologist";
      break;
      case GOODALL:
        whatKind = "primatologist";
      break;
      case SAGAN:
        whatKind = "astronomer";
      break;
      case SACKS:
        whatKind = "neurologist";
      break;
      default:
        log.debug("Got an unknown scientist");
        whatKind = "Unknown";
    }

    return whatKind;
  }

  public String whatKindOfScientist_After(Scientist scientist) {
    return switch (scientist) {
      case EINSTEIN, CURIE, RUTHERFORD -> {
        //do something else
        yield "physicist";
      }
      case WATSON, CRICK -> "molecular biologist";
      case GOODALL -> "primatologist";
      case SAGAN -> "astronomer";
      case SACKS -> "neurologist";
      default -> {
        log.debug("Got an unknown scientist");
        yield "unknown";
      }
    };
  }

}
