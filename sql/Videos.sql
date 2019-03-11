CREATE TABLE Videos (
  Id Long PRIMARY IDENTITY,
  Title VARCHAR(50) NOT NULL,
  Description VARCHAR(200) NOT NULL,
  VideoType CHAR(10) NOT NULL,
  YoutubeVideoRefId REFERENCES YoutubeVideoRefs(Id) NOT NULL
)