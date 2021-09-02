package models;

public class Job {
    private Integer id;
    private Integer userid;
    private String sourcefile;
    private String status;
    private String notifyurl;
    private String created;
    private String started;
    private String finished;
    private String prevstatus;
    private String downloaded;
    private String filesize;
    private String processor;
    private String progress;
    private String time_left;
    /*"format": [
    {
        "id": "[ID]",
            "status": "[Status]",
            "created": "[Date]",
            "started": "[Date]",
            "finished": "[Date]",
            "s3_destination": "[TempS3Link]",
            "cf_destination": "[TempCFLink]",
            "convertedsize": "[FileSize]",
            "time_left": "[TotalTimeLeft]",
            "progress": "[TotalProgress]",
            "time_left_current": "[StatusTimeLeft]",
            "progress_current": "[StatusPorgress]",
            "file_size": "[FileSize]",
            "destination": [
        "[URL]",
                "[URL_2]",
                "[URL_N]"
                        ],
        "destination_status": [
        "[Saved|Error (ErrorDescription)]",
                "[Saved|Error (ErrorDescription)]",
                "[Saved|Error (ErrorDescription)]"
                        ],
        "audio_validation": [
        {
            "stream_id": "[AudioStreamID]",
                "alternate_id": "[AlternateID]",
                "state": "[ValidationStatus]",
                "muted_channels": [
            "[ChannelNumber1]",
                    "[ChannelNumber2]",
                    // ...
                    "[ChannelNumberN]"
                                ],
            "too_low_level": [
            "[ChannelNumber1]",
                    "[ChannelNumber2]",
                    // ...
                    "[ChannelNumberN]"
                                ],
            "stereo_diff": "[0|1]",
                "side_diff": "[0|1]",
                "high_freq_lfe": "[0|1]"*/
}
