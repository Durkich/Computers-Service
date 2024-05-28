-- Вставка данных в таблицу infrastructure.computers
INSERT INTO infrastructure.computers (id, inventory_number, graphic_adapter, processor, rom, ram) VALUES 
(1, '128g', 'GTX950', 'i5-4460', 128, 8),
(2, 'Блабла', 'NVIDIA GeForce RTX 3080', 'Intel Core i9-10900K', 512, 32);

-- Вставка данных в таблицу infrastructure.laptops
INSERT INTO infrastructure.laptops (id, inventory_number, graphic_adapter, processor, rom, ram, display) VALUES 
(1, 'LT123', 'Intel UHD Graphics', 'Intel Core i5-8250U', 256, 16, '15.6" FHD'),
(2, 'LT124', 'NVIDIA GeForce MX250', 'Intel Core i7-8565U', 512, 32, '15.6" 4K UHD');

-- Вставка данных в таблицу infrastructure.peripherals
INSERT INTO infrastructure.peripherals (id, peripheral_name, peripheral_type, computer_id, laptop_id) VALUES 
(1, 'Logitech Mouse', 'Mouse', 1, NULL),
(2, 'Dell Keyboard', 'Keyboard', 1, NULL),
(3, 'HP Printer', 'Printer', NULL, 1);

-- Вставка данных в таблицу infrastructure.software
INSERT INTO infrastructure.software (id, software_name, software_version, is_licensed, computer_id, laptop_id) VALUES 
(1, 'Windows 10 Pro', '10.0', true, 1, NULL),
(2, 'Microsoft Office', '2019', true, 1, NULL),
(3, 'Adobe Photoshop', '2021', true, NULL, 1);
