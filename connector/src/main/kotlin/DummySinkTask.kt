package connector

import org.apache.kafka.clients.consumer.OffsetAndMetadata
import org.apache.kafka.common.TopicPartition
import org.apache.kafka.connect.sink.SinkRecord
import org.apache.kafka.connect.sink.SinkTask

class DummySinkTask : SinkTask()
{
    override fun put(records: MutableCollection<SinkRecord>?) {
        // write all records to output
        records?.forEach { print("$it.value()") }
    }

    override fun version(): String {
        return "1.0.0.0"
    }

//    override fun open(partitions: MutableCollection<TopicPartition>?) {
//        super.open(partitions)
//    }

    override fun flush(currentOffsets: MutableMap<TopicPartition, OffsetAndMetadata>?) {
        // Commit output data
        super.flush(currentOffsets)
    }

    override fun start(props: MutableMap<String, String>?) {

    }

    override fun stop() {
    }

//    override fun preCommit(currentOffsets: MutableMap<TopicPartition, OffsetAndMetadata>?): MutableMap<TopicPartition, OffsetAndMetadata> {
//        return super.preCommit(currentOffsets)
//    }
//
//    override fun initialize(context: SinkTaskContext?) {
//        super.initialize(context)
//    }
//
//    override fun close(partitions: MutableCollection<TopicPartition>?) {
//        super.close(partitions)
//    }

}