TESTS_DIR = ../../../../..
INFER_OPTIONS = --pulse-only --debug-exceptions --pulse-nullsafe-report-npe-as-separate-issue \
--pulse-report-issues-for-tests --report-suppress-errors SENSITIVE_DATA_FLOW \
--pulse-taint-config .infertaintconfig \
--report-suppress-errors DATA_FLOW_TO_SINK
INFERPRINT_OPTIONS = --issues-tests
SOURCES = $(wildcard *.java)

include $(TESTS_DIR)/javac.make