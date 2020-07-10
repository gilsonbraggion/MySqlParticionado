ALTER TABLE registro
PARTITION BY RANGE (YEAR(data_registro))
    (PARTITION p_2019 VALUES LESS THAN (2020),
    PARTITION p_2020 VALUES LESS THAN (2021),
    PARTITION p_2021 VALUES LESS THAN (2022),
    PARTITION p_2022 VALUES LESS THAN (2023));
    
    select * from registro partition (`p_2020`);
    
    select table_name, 
    		partition_name, 
    		partition_ordinal_position as pos,
    		partition_description as par_desc, 
    		table_rows  
    from information_schema.partitions 
    	where table_name='registro';

-- Documentação de referência.
-- https://www.performancedb.com/blog/particionamento-de-tabelas-no-mysql/