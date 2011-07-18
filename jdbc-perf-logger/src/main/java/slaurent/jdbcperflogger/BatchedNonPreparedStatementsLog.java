package slaurent.jdbcperflogger;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class BatchedNonPreparedStatementsLog extends AbstractLogMessage {

    private static final long serialVersionUID = 1L;

    private final List<String> sqlList;

    public BatchedNonPreparedStatementsLog(final UUID logId, final long timestamp, final long executionTimeNanos,
            final List<String> sqlList, final String threadName, final SQLException exc) {
        super(logId, timestamp, executionTimeNanos, StatementType.NON_PREPARED_BATCH_EXECUTION, threadName, exc);
        this.sqlList = Collections.unmodifiableList(new ArrayList<String>(sqlList));
    }

    public List<String> getSqlList() {
        return sqlList;
    }

}