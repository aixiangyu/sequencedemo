
DROP TABLE IF EXISTS `sequence`;
CREATE TABLE `sequence` (
  `table_name` varchar(64) NOT NULL,
  `current_value` int(11) NOT NULL,
  `increment` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`table_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;



DROP FUNCTION IF EXISTS `currval`;

DELIMITER//

CREATE FUNCTION `currval` (seq_name VARCHAR(64)) RETURNS INT(11)
	READS SQL DATA
	DETERMINISTIC
BEGIN
	DECLARE VALUE INTEGER;

	SET VALUE = 0;

	SELECT current_value INTO VALUE FROM sequence WHERE table_name = seq_name;

	RETURN VALUE;

END//

DELIMITER;



DROP FUNCTION IF EXISTS `nextval`;

DELIMITER//

CREATE FUNCTION `nextval` (seq_name VARCHAR(64)) RETURNS INT(11)
	DETERMINISTIC
BEGIN

	UPDATE sequence SET current_value = current_value + increment WHERE table_name = seq_name;

	RETURN currval(seq_name);

END//

DELIMITER;

