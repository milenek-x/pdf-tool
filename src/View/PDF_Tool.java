/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author User
 */
public class PDF_Tool extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public PDF_Tool() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_title = new javax.swing.JLabel();
        tab_list = new javax.swing.JTabbedPane();
        tab_merge_pdf = new javax.swing.JPanel();
        btn_merge_add_pdf = new javax.swing.JButton();
        btn_merge_remove_pdf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_merge_pdf = new javax.swing.JList<>();
        tab_save_pdf = new javax.swing.JButton();
        txt_merge_rename_file = new javax.swing.JTextField();
        btn_merge_pdf = new javax.swing.JButton();
        tab_split_pdf = new javax.swing.JPanel();
        btn_split_browse_pdf = new javax.swing.JButton();
        lbl_split_browse_pdf = new javax.swing.JLabel();
        rad_split_page_per_pdf = new javax.swing.JRadioButton();
        rad_split_custom = new javax.swing.JRadioButton();
        spin_split_pages = new javax.swing.JSpinner();
        txt_split_custom = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_split_pdf_list = new javax.swing.JList<>();
        btn_split_save_pdf = new javax.swing.JButton();
        btn_split_split_pdf = new javax.swing.JButton();
        tab_reorder_pdf = new javax.swing.JPanel();
        btn_reorder_browse_pdf = new javax.swing.JButton();
        lbl_reorder_browse_pdf = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        list_reorder_pdf_list = new javax.swing.JList<>();
        btn_reorder_save_pdf = new javax.swing.JButton();
        btn_reorder_up = new javax.swing.JButton();
        btn_reorder_down = new javax.swing.JButton();
        txt_reorder_rename_file = new javax.swing.JTextField();
        tab_remove_pdf = new javax.swing.JPanel();
        btn_remove_browse_pdf = new javax.swing.JButton();
        lbl_remove_browse_pdf = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        list_remove_pdf_list = new javax.swing.JList<>();
        btn_remove_page = new javax.swing.JButton();
        txt_remove_rename_file = new javax.swing.JTextField();
        btn_remove_save_pdf = new javax.swing.JButton();
        tab_change_pdf_quality = new javax.swing.JPanel();
        btn_quality_browse_pdf = new javax.swing.JButton();
        lbl_quality_browse_pdf = new javax.swing.JLabel();
        rad_quality_low = new javax.swing.JRadioButton();
        rad_quality_standard = new javax.swing.JRadioButton();
        btn_quality_save_pdf = new javax.swing.JButton();
        rad_quality_higher = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_title.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        lbl_title.setText("PDF Tool");

        tab_list.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tab_list.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tab_merge_pdf.setFocusable(false);

        btn_merge_add_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_merge_add_pdf.setText("Add PDFs");

        btn_merge_remove_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_merge_remove_pdf.setText("Remove PDFs");

        list_merge_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        list_merge_pdf.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list_merge_pdf);

        tab_save_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tab_save_pdf.setText("Save PDF");

        txt_merge_rename_file.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_merge_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_merge_pdf.setText("Merge PDFs");

        javax.swing.GroupLayout tab_merge_pdfLayout = new javax.swing.GroupLayout(tab_merge_pdf);
        tab_merge_pdf.setLayout(tab_merge_pdfLayout);
        tab_merge_pdfLayout.setHorizontalGroup(
            tab_merge_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_merge_pdfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_merge_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_merge_pdfLayout.createSequentialGroup()
                        .addComponent(btn_merge_add_pdf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                        .addComponent(btn_merge_remove_pdf))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_merge_rename_file, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_merge_pdfLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(tab_merge_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_merge_pdf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tab_save_pdf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        tab_merge_pdfLayout.setVerticalGroup(
            tab_merge_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_merge_pdfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_merge_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_merge_add_pdf)
                    .addComponent(btn_merge_remove_pdf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_merge_pdf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(txt_merge_rename_file, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab_save_pdf)
                .addGap(18, 18, 18))
        );

        tab_list.addTab("Merge PDFs", tab_merge_pdf);

        btn_split_browse_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_split_browse_pdf.setText("Browse PDF");

        lbl_split_browse_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_split_browse_pdf.setText("No File Selected");

        rad_split_page_per_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rad_split_page_per_pdf.setText("Pages Per PDF");

        rad_split_custom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rad_split_custom.setText("Custom");

        spin_split_pages.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_split_custom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_split_custom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_split_customActionPerformed(evt);
            }
        });

        list_split_pdf_list.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        list_split_pdf_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(list_split_pdf_list);

        btn_split_save_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_split_save_pdf.setText("Save PDFs");

        btn_split_split_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_split_split_pdf.setText("Split PDF");

        javax.swing.GroupLayout tab_split_pdfLayout = new javax.swing.GroupLayout(tab_split_pdf);
        tab_split_pdf.setLayout(tab_split_pdfLayout);
        tab_split_pdfLayout.setHorizontalGroup(
            tab_split_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_split_pdfLayout.createSequentialGroup()
                .addGroup(tab_split_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_split_pdfLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(tab_split_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rad_split_page_per_pdf)
                            .addComponent(rad_split_custom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addGroup(tab_split_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_split_custom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spin_split_pages, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tab_split_pdfLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_split_pdfLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_split_save_pdf))
                    .addGroup(tab_split_pdfLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tab_split_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tab_split_pdfLayout.createSequentialGroup()
                                .addComponent(btn_split_browse_pdf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_split_browse_pdf)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_split_pdfLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_split_split_pdf)))))
                .addContainerGap())
        );
        tab_split_pdfLayout.setVerticalGroup(
            tab_split_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_split_pdfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_split_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_split_browse_pdf)
                    .addComponent(lbl_split_browse_pdf))
                .addGap(18, 18, 18)
                .addGroup(tab_split_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rad_split_page_per_pdf)
                    .addComponent(spin_split_pages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(tab_split_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rad_split_custom)
                    .addComponent(txt_split_custom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(btn_split_split_pdf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_split_save_pdf)
                .addContainerGap())
        );

        tab_list.addTab("Split PDF Pages", tab_split_pdf);

        btn_reorder_browse_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_reorder_browse_pdf.setText("Browse PDF");

        lbl_reorder_browse_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_reorder_browse_pdf.setText("No File Selected");

        list_reorder_pdf_list.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        list_reorder_pdf_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(list_reorder_pdf_list);

        btn_reorder_save_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_reorder_save_pdf.setText("Save PDF");
        btn_reorder_save_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reorder_save_pdfActionPerformed(evt);
            }
        });

        btn_reorder_up.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_reorder_up.setText("Move Page Up");

        btn_reorder_down.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_reorder_down.setText("Move Page Down");

        txt_reorder_rename_file.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout tab_reorder_pdfLayout = new javax.swing.GroupLayout(tab_reorder_pdf);
        tab_reorder_pdf.setLayout(tab_reorder_pdfLayout);
        tab_reorder_pdfLayout.setHorizontalGroup(
            tab_reorder_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_reorder_pdfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_reorder_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_reorder_pdfLayout.createSequentialGroup()
                        .addComponent(btn_reorder_up)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                        .addComponent(btn_reorder_down))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_reorder_rename_file, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_reorder_pdfLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_reorder_save_pdf)))
                .addContainerGap())
            .addGroup(tab_reorder_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tab_reorder_pdfLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(btn_reorder_browse_pdf)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lbl_reorder_browse_pdf)
                    .addContainerGap(240, Short.MAX_VALUE)))
        );
        tab_reorder_pdfLayout.setVerticalGroup(
            tab_reorder_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_reorder_pdfLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_reorder_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reorder_up)
                    .addComponent(btn_reorder_down))
                .addGap(54, 54, 54)
                .addComponent(txt_reorder_rename_file, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_reorder_save_pdf)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(tab_reorder_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tab_reorder_pdfLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(tab_reorder_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_reorder_browse_pdf)
                        .addComponent(lbl_reorder_browse_pdf))
                    .addContainerGap(417, Short.MAX_VALUE)))
        );

        tab_list.addTab("Reorder PDF Pages", tab_reorder_pdf);

        btn_remove_browse_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_remove_browse_pdf.setText("Browse PDF");

        lbl_remove_browse_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_remove_browse_pdf.setText("No File Selected");

        list_remove_pdf_list.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        list_remove_pdf_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(list_remove_pdf_list);

        btn_remove_page.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_remove_page.setText("Remove Pages");

        txt_remove_rename_file.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_remove_save_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_remove_save_pdf.setText("Save PDF");

        javax.swing.GroupLayout tab_remove_pdfLayout = new javax.swing.GroupLayout(tab_remove_pdf);
        tab_remove_pdf.setLayout(tab_remove_pdfLayout);
        tab_remove_pdfLayout.setHorizontalGroup(
            tab_remove_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_remove_pdfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_remove_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_remove_pdfLayout.createSequentialGroup()
                        .addComponent(btn_remove_browse_pdf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_remove_browse_pdf)
                        .addGap(0, 228, Short.MAX_VALUE))
                    .addComponent(txt_remove_rename_file)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_remove_pdfLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(tab_remove_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_remove_page, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_remove_save_pdf, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        tab_remove_pdfLayout.setVerticalGroup(
            tab_remove_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_remove_pdfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_remove_pdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_remove_browse_pdf)
                    .addComponent(lbl_remove_browse_pdf))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_remove_page)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(txt_remove_rename_file, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_remove_save_pdf)
                .addGap(12, 12, 12))
        );

        tab_list.addTab("Remove PDF Pages", tab_remove_pdf);

        btn_quality_browse_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_quality_browse_pdf.setText("Browse PDF");

        lbl_quality_browse_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_quality_browse_pdf.setText("No File Selected");

        rad_quality_low.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rad_quality_low.setText("Low Quality");

        rad_quality_standard.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rad_quality_standard.setText("Standard Quality");

        btn_quality_save_pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_quality_save_pdf.setText("Save PDF");

        rad_quality_higher.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rad_quality_higher.setText("Higher Quality");

        javax.swing.GroupLayout tab_change_pdf_qualityLayout = new javax.swing.GroupLayout(tab_change_pdf_quality);
        tab_change_pdf_quality.setLayout(tab_change_pdf_qualityLayout);
        tab_change_pdf_qualityLayout.setHorizontalGroup(
            tab_change_pdf_qualityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_change_pdf_qualityLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rad_quality_higher)
                .addContainerGap(347, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_change_pdf_qualityLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_quality_save_pdf)
                .addGap(31, 31, 31))
            .addGroup(tab_change_pdf_qualityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tab_change_pdf_qualityLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(tab_change_pdf_qualityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tab_change_pdf_qualityLayout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(tab_change_pdf_qualityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rad_quality_low)
                                .addComponent(rad_quality_standard)))
                        .addGroup(tab_change_pdf_qualityLayout.createSequentialGroup()
                            .addComponent(btn_quality_browse_pdf)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbl_quality_browse_pdf)))
                    .addContainerGap(240, Short.MAX_VALUE)))
        );
        tab_change_pdf_qualityLayout.setVerticalGroup(
            tab_change_pdf_qualityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_change_pdf_qualityLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(rad_quality_higher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_quality_save_pdf)
                .addContainerGap(254, Short.MAX_VALUE))
            .addGroup(tab_change_pdf_qualityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tab_change_pdf_qualityLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(tab_change_pdf_qualityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_quality_browse_pdf)
                        .addComponent(lbl_quality_browse_pdf))
                    .addGap(18, 18, 18)
                    .addComponent(rad_quality_low)
                    .addGap(6, 6, 6)
                    .addComponent(rad_quality_standard)
                    .addContainerGap(333, Short.MAX_VALUE)))
        );

        tab_list.addTab("Change PDF Page Quality", tab_change_pdf_quality);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_title)
                    .addComponent(tab_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tab_list)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("PDFTool");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_split_customActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_split_customActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_split_customActionPerformed

    private void btn_reorder_save_pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reorder_save_pdfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reorder_save_pdfActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PDF_Tool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PDF_Tool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PDF_Tool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDF_Tool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDF_Tool().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_merge_add_pdf;
    private javax.swing.JButton btn_merge_pdf;
    private javax.swing.JButton btn_merge_remove_pdf;
    private javax.swing.JButton btn_quality_browse_pdf;
    private javax.swing.JButton btn_quality_save_pdf;
    private javax.swing.JButton btn_remove_browse_pdf;
    private javax.swing.JButton btn_remove_page;
    private javax.swing.JButton btn_remove_save_pdf;
    private javax.swing.JButton btn_reorder_browse_pdf;
    private javax.swing.JButton btn_reorder_down;
    private javax.swing.JButton btn_reorder_save_pdf;
    private javax.swing.JButton btn_reorder_up;
    private javax.swing.JButton btn_split_browse_pdf;
    private javax.swing.JButton btn_split_save_pdf;
    private javax.swing.JButton btn_split_split_pdf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_quality_browse_pdf;
    private javax.swing.JLabel lbl_remove_browse_pdf;
    private javax.swing.JLabel lbl_reorder_browse_pdf;
    private javax.swing.JLabel lbl_split_browse_pdf;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JList<String> list_merge_pdf;
    private javax.swing.JList<String> list_remove_pdf_list;
    private javax.swing.JList<String> list_reorder_pdf_list;
    private javax.swing.JList<String> list_split_pdf_list;
    private javax.swing.JRadioButton rad_quality_higher;
    private javax.swing.JRadioButton rad_quality_low;
    private javax.swing.JRadioButton rad_quality_standard;
    private javax.swing.JRadioButton rad_split_custom;
    private javax.swing.JRadioButton rad_split_page_per_pdf;
    private javax.swing.JSpinner spin_split_pages;
    private javax.swing.JPanel tab_change_pdf_quality;
    private javax.swing.JTabbedPane tab_list;
    private javax.swing.JPanel tab_merge_pdf;
    private javax.swing.JPanel tab_remove_pdf;
    private javax.swing.JPanel tab_reorder_pdf;
    private javax.swing.JButton tab_save_pdf;
    private javax.swing.JPanel tab_split_pdf;
    private javax.swing.JTextField txt_merge_rename_file;
    private javax.swing.JTextField txt_remove_rename_file;
    private javax.swing.JTextField txt_reorder_rename_file;
    private javax.swing.JTextField txt_split_custom;
    // End of variables declaration//GEN-END:variables
}
